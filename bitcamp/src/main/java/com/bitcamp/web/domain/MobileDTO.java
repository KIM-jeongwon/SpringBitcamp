package com.bitcamp.web.domain;
public class MobileDTO {
 private String regdate,mobilenum,customnum,id;

public String getRegdate() {
	return regdate;
}

public void setRegdate(String regdate) {
	this.regdate = regdate;
}



public String getMobilenum() {
	return mobilenum;
}

public void setMobilenum(String mobilenum) {
	this.mobilenum = mobilenum;
}

public String getCustomnum() {
	return customnum;
}

public void setCustomnum(String customnum) {
	this.customnum = customnum;
}


public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

@Override
public String toString() {
	return "MobileBean [regdate=" + regdate + ", mobilenum=" + mobilenum + ", customnum=" + customnum + ", id=" + id
			+ "]";
}

}
