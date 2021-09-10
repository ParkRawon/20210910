package co.ppp.prj.notice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.ppp.prj.notice.service.NoticeService;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeDao;  //의존성 주입
	
	@RequestMapping("/noticeList.do")  //게시판 목록
	public String noticeList(Model model) {
		model.addAttribute("notices", noticeDao.noticeSelectList());
		
		return "notice/noticeList";
		
	}

}
