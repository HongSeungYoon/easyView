package kr.ac.easyview.dto;

import java.util.Date;

public class StudentCalendarVO {
	//학생 캘린더
	private int stucno; //캘린더번호
	private String writer; //작성자
	private String title; //제목
	private String content; //내용
	private Date startDate; //시작날짜
	private Date endDate; //마지막날짜
	private int allDay; //모든날짜
	private Date regDate; //등록일
	private Date updateDate; //수정일
	public int getStucno() {
		return stucno;
	}
	public void setStucno(int stucno) {
		this.stucno = stucno;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getAllDay() {
		return allDay;
	}
	public void setAllDay(int allDay) {
		this.allDay = allDay;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
}
