package spms.vo;

import java.util.Date;

/* 테이블의 1개행의 데이터를 모두 묶어서 담는 클래스 객체를
 * Vo(Value Object)라고 한다.
 * 
 * MVC의 역할을 나누면 (테이블)데이터를 묶어서 전달하는 객체 필요하다.
 * 이 때 Vo를 주고 받으면 이 Vo는 Dto(Data Transfer Object)라고 불린다.
 * 
 * Vo와 Dto는 구성이 같지만 가끔 용도에 따라 필드를 약간 달리할 때가 있다.
 * 또 getter/setter도 달리할 때가 있다.
 * 이럴 때는 Vo와 Dto를 따로 만드는 경우도 있다.
 * 그래도 ModelMapper로 Vo <-> Dto를 상호 변환해서 사용하기도 한다.
 * */
public class Member {
	private int no;
	private String name;
	private String email;
	private String password;
	private Date createdDate;
	private Date modifiedDate;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + ", email=" + email + ", password=" + password + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + "]";
	}	
}











