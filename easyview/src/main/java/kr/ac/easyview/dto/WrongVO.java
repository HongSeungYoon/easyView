package kr.ac.easyview.dto;

public class WrongVO {
	//오답테이블
	private int wno; //오답번호
	private String stuId; //아이디
	private String content; //내용
	private int prono; //문제코드
	public int getWno() {
		return wno;
	}
	public void setWno(int wno) {
		this.wno = wno;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getProno() {
		return prono;
	}
	public void setProno(int prono) {
		this.prono = prono;
	}
	
	
}
