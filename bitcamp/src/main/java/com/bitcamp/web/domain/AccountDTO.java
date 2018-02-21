package com.bitcamp.web.domain;


public class AccountDTO {

private String accountNum,money,customNum;




public String getCustomNum() {
	return customNum;
}

public void setCustomNum(String customNum) {
	this.customNum = customNum;
}

public String getAccountNum() {
	return accountNum;
}

public void setAccountNum(String accountNum) {
	this.accountNum = accountNum;
}

public String getMoney() {
	return money;
}

public void setMoney(String money) {
	this.money = money;
}
@Override
public String toString() {
	return "계좌번호 [고객번호=" + accountNum + ", 잔액=" + money + ", 고객번호=" + customNum + "]";
	}
}
