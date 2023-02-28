package kr.ac.easyview.dto;

import java.util.Date;

public class QanswerVO {
	//질문 답변 테이블
	
	private int qano; //질문답변번호
	private Date regDate; //작성일
	private String answer; //답변
	private String writer; //작성자
	private int qno; //질문번호
	private int readCheck; //수신여부
	public int getQano() {
		return qano;
	}
	public void setQano(int qano) {
		this.qano = qano;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public int getReadCheck() {
		return readCheck;
	}
	public void setReadCheck(int readCheck) {
		this.readCheck = readCheck;
	}
	
	
}
