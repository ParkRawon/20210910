package co.ppp.prj.notice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.ppp.prj.notice.service.NoticeService;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeDao;  //의존성 주입, dao 연결하기
	
	@RequestMapping("/noticeList.do")  //게시판 목록 호출명,메소드명,페이지명 이름 똑같이 만들기
	public String noticeList(Model model) {//페이지에 돌려주기 위해 model만듬
		model.addAttribute("notices", noticeDao.noticeSelectList());
		
		return "notice/noticeList";
		
	}

}
