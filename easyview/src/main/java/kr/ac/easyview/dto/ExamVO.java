package kr.ac.easyview.dto;

import java.util.Date;

public class ExamVO {
	//시험테이블
	private int eno; //시험번호
	private int lno; //강의번호
	private String name; //시험이름
	private Date regDate; //등록일자
	private Date endDate; //마감일자
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getLno() {
		return lno;
	}
	public void setLno(int lno) {
		this.lno = lno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
