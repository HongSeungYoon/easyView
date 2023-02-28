package kr.ac.easyview.dto;

public class ExamProblemVO {
	//시험문제 테이블
	private int epno; //시험문제코드
	private int prono; //문제코드
	private int eno; //시험번호
	private int question; //문항
	public int getEpno() {
		return epno;
	}
	public void setEpno(int epno) {
		this.epno = epno;
	}
	public int getProno() {
		return prono;
	}
	public void setProno(int prono) {
		this.prono = prono;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getQuestion() {
		return question;
	}
	public void setQuestion(int question) {
		this.question = question;
	}
	
	
}
