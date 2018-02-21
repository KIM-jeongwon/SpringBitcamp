package com.bitcamp.web.enums;

public enum TnameEnum {
	MEMBER,ATTEND,BANK,PHONE,
	TNAMES{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return MEMBER+","+ATTEND+","+BANK+","+PHONE;
		}
	}
}
