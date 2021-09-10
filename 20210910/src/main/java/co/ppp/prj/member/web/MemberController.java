package co.ppp.prj.member.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;


import co.ppp.prj.member.service.MemberService;
import co.ppp.prj.member.vo.MemberVO;

@Controller
public class MemberController {
	@Autowired  //IoC에 있는 것을 찾아 자동으로 주입해주세요
	private MemberService memberDao;   //의존성 주입(DI) 
	
	@RequestMapping("/memberList.do")    //회원 목록
	public String memberList(Model model) {
		model.addAttribute("members",memberDao.memberSelectList());
		
		return "member/memberList";
	}
	
	@RequestMapping("/memberSelect.do")  //회원 한명씩보기
	public String memberSelect(Model model, MemberVO vo) {	
		vo.setId("micol");//강제로 주입			
		model.addAttribute("member", memberDao.memberSelect(vo));  //의존성 주입 
		
		return "member/memberSelect";
	}
	
	@RequestMapping("/loginForm.do")  //로그인 화면 띄우기
	public String loginForm(Model model) {
		
		return "member/loginForm";
	}
	
	@RequestMapping("/login.do")   //로그인 하기
	public String login(MemberVO vo, Model model, HttpSession session) {
		
		String views = null;
		vo = memberDao.memberLogin(vo);
		
		if(vo != null) {
			session.setAttribute("id", vo.getId());
			session.setAttribute("name", vo.getName());
			session.setAttribute("auth", vo.getAuth());
//			model.addAttribute("member", vo);
//			views = "member/loginSuccess";
			views = "redirect:memberList.do";  //직접 controller를 호출하고 싶을때
		}else {
			model.addAttribute("message", "로그인 실패");
			views = "member/loginFail";
		}
		return views;
	}
	
	

}
