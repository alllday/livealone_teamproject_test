package com.multi.liveAlone;

public class MemberVO_real {
	private String id;
	private String address;
	private String nickname;
	private int certification;
	private String point;
	private int count;
	private String passwore;
	private int mileage;
	private int admin;
	
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getCertification() {
		return certification;
	}
	public void setCertification(int certification) {
		this.certification = certification;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getPasswore() {
		return passwore;
	}
	public void setPasswore(String passwore) {
		this.passwore = passwore;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", address=" + address + ", nickname=" + nickname
				+ ", certification=" + certification + ", point=" + point + ", count=" + count + ", passwore="
				+ passwore + ", mileage=" + mileage + ", admin=" + admin + "]";
	}
	
	
}
