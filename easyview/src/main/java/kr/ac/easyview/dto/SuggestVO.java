package kr.ac.easyview.dto;

import java.util.Date;

public class SuggestVO {
	//강의제안 테이블
	private int sugno; //제안번호
	private String sender; //발신자
	private String receiver; //수신자
	private Date sendDate; //발송일자
	private int readCheck; //수신상태
	public int getSugno() {
		return sugno;
	}
	public void setSugno(int sugno) {
		this.sugno = sugno;
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
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	public int getReadCheck() {
		return readCheck;
	}
	public void setReadCheck(int readCheck) {
		this.readCheck = readCheck;
	}
	
	
}
