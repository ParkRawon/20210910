package co.ppp.prj.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.ppp.prj.member.service.MemberMapper;
import co.ppp.prj.member.service.MemberService;
import co.ppp.prj.member.vo.MemberVO;

@Repository("memberDao") //spring컨테이너(IoC)에 등록해주세요
public class MemberServiceImpl implements MemberService {
	
	@Autowired //SqlSession을 자동으로 연결	
	private MemberMapper map;
	

	@Override
	public List<MemberVO> memberSelectList() {
		// 회원 목록
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// 회원 선택
		return map.memberSelect(vo);
	}

	@Override
	public MemberVO memberLogin(MemberVO vo) {
		// 로그인 하기
		return map.memberLogin(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		//회원 등록
		return map.memberInsert(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// 회원 삭제
		return map.memberDelete(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// 회원 수정
		return map.memberUpdate(vo);
	}

}
