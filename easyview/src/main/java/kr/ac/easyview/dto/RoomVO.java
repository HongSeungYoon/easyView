package kr.ac.easyview.dto;

public class RoomVO {
	//강의실 테이블
	private int roomno; //강의장번호
	private String name; //강의장이름
	private int limit; //허용인원
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	
	
}
