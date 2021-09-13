package co.ppp.prj.member.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor  //빈(기본)생성자 만들기
@Setter   //setter 만들기
@Getter   //getter 만들기
public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String address;
	private String auth;	
	

}
