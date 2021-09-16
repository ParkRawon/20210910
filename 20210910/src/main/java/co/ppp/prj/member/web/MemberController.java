package co.ppp.prj.member.web;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public String memberSelect(MemberVO vo, Model model) {	
		model.addAttribute("member", memberDao.memberSelect(vo));  //의존성 주입 
		
		return "member/memberSelect";
	}
	
	@RequestMapping("/loginForm.do")  //로그인 화면 띄우기
	public String loginForm(Model model) {
		
		return "notiles/loginForm";
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
	
	@RequestMapping("/joinForm.do")  
	String JoinForm() {  
		
		return "member/joinForm";
	}
	
//	@PostMapping("/memberJoin.do")    //회원가입
//	String memberJoin(MemberVO vo, Model model) {
//		int n = memberDao.memberInsert(vo);
//		String view = null;
//		
//		if(n != 0) {
//			view = "redirect:memberList.do";
//		}else {
//			model.addAttribute("message", "회원가입 실패");
//			view = "member/joinFail";
//		}
//		
//		return view;
//	}
	
	@PostMapping("/memberJoin.do")
	ModelAndView memberJoin(MemberVO vo, ModelAndView mv) {
		int n = memberDao.memberInsert(vo);
		
		if(n != 0) {
			mv.setViewName("redirect:memberList.do");
		}else {
			mv.addObject("message", "회원가입 실패");
			mv.setViewName("member/joinFail");
		}
		
		return mv;
	}
	
	

}
