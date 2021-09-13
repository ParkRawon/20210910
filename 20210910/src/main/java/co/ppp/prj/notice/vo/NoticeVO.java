package co.ppp.prj.notice.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NoticeVO {
	private int id;
	private String writer;
	private Date writeDate;
	private String title;
	private String contents;
	private int hit;
	
	private String name;   //확장 member 테이블에 있는 name
	
	
}
