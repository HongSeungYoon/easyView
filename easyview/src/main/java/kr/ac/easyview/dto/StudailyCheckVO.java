package kr.ac.easyview.dto;

import java.util.Date;

public class StudailyCheckVO {
	// 학생출석테이블
	private int stuDailyno; //출석번호
	private String stuId; //학생아이디
	private int lno; //강의번호
	private int status; //상태
	private Date regDate; //등록일
	public int getStuDailyno() {
		return stuDailyno;
	}
	public void setStuDailyno(int stuDailyno) {
		this.stuDailyno = stuDailyno;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public int getLno() {
		return lno;
	}
	public void setLno(int lno) {
		this.lno = lno;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
}
