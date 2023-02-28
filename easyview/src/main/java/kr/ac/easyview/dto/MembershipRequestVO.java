package kr.ac.easyview.dto;

import java.util.Date;

public class MembershipRequestVO {
	//가입요청 테이블
	
	private int memno; //가입요청번호
	private String sender; //발송자
	private String receiver; //수신자
	private Date regDate; //요청일
	private int readCheck; //수신여부
	public int getMemno() {
		return memno;
	}
	public void setMemno(int memno) {
		this.memno = memno;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getReadCheck() {
		return readCheck;
	}
	public void setReadCheck(int readCheck) {
		this.readCheck = readCheck;
	}
	
	
}
