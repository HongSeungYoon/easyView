package kr.ac.easyview.dto;

import java.util.Date;

public class CostVO {
	//지출테이블
	private int cno; //지출번호
	private String staffId;//직원아이디
	private int sum;//금액
	private Date payDate;//지출날짜
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	
	
	
}
