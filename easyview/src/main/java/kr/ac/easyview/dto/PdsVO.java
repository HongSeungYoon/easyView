package kr.ac.easyview.dto;

import java.util.Date;

public class PdsVO {
		//자료실테이블
	private int pno; //글번호
	private String title; //제목
	private String content; //내용
	private Date regDate; //등록일
	private int viewcnt; //조회수
	private Date updateDate; //수정일
	private String writer; //작성자
	private int updateCheck; //수정여부
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
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
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getUpdateCheck() {
		return updateCheck;
	}
	public void setUpdateCheck(int updateCheck) {
		this.updateCheck = updateCheck;
	}
	
	
}
