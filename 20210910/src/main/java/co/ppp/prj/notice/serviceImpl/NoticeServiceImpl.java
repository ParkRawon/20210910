package co.ppp.prj.notice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.ppp.prj.notice.service.NoticeMapper;
import co.ppp.prj.notice.service.NoticeService;
import co.ppp.prj.notice.vo.NoticeVO;

@Repository("noticeDao")  //spring bean에 태우기위해
public class NoticeServiceImpl implements NoticeService {

	@Autowired  //notice-map.xml을 bean에 태우기위해
	private NoticeMapper map;
	
	@Override
	public List<NoticeVO> noticeSelectList() {
		// 공지사항 목록
		return map.noticeSelectList();
	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		// 공지사항 하나씩 보기
		return map.noticeSelect(vo);
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		// 공지사항 적기
		return map.noticeInsert(vo);
	}

	@Override
	public int noticeUpdate(NoticeVO vo) {
		// 공지사항 수정
		return map.noticeUpdate(vo);
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
		// 공지사항 삭제
		return map.noticeDelete(vo);
	}

}
