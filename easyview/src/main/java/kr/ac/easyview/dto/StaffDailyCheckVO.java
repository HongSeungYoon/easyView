package kr.ac.easyview.dto;

import java.util.Date;

public class StaffDailyCheckVO {
	//직원근태 테이블
	private int staffDailyno; //근태번호
	private Date inTime; //출근시간
	private Date outTime; //퇴근시간
	private int status; //상태
	private String staffId; //직원아이디
	public int getStaffDailyno() {
		return staffDailyno;
	}
	public void setStaffDailyno(int staffDailyno) {
		this.staffDailyno = staffDailyno;
	}
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public Date getOutTime() {
		return outTime;
	}
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	
	
}
