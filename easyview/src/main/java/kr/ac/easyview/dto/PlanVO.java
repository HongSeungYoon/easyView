package kr.ac.easyview.dto;

import java.util.Date;

public class PlanVO {
	//강의계획서 테이블
	private int planno; //계획서번호
	private Date regDate; //작성일자
	private String title; //제목
	private int sugno; //제안번호
	private String writer; //작성강사아이디
	private int subno; //과목번호
	private String content; //강의내용
	private int totalTime; //총 강의시간
	private int weekTime; //주당강의시간
	private Date startDate; //시작일
	private Date endDate; //종료일
	private String textName; //교재
	private String lecturegoal; //강의목표
	private int status; //저장상태
	private int dayTime; //하루강의시간
	public int getPlanno() {
		return planno;
	}
	public void setPlanno(int planno) {
		this.planno = planno;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getSugno() {
		return sugno;
	}
	public void setSugno(int sugno) {
		this.sugno = sugno;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getSubno() {
		return subno;
	}
	public void setSubno(int subno) {
		this.subno = subno;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}
	public int getWeekTime() {
		return weekTime;
	}
	public void setWeekTime(int weekTime) {
		this.weekTime = weekTime;
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
	public String getTextName() {
		return textName;
	}
	public void setTextName(String textName) {
		this.textName = textName;
	}
	public String getLecturegoal() {
		return lecturegoal;
	}
	public void setLecturegoal(String lecturegoal) {
		this.lecturegoal = lecturegoal;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getDayTime() {
		return dayTime;
	}
	public void setDayTime(int dayTime) {
		this.dayTime = dayTime;
	}
	
	
}
