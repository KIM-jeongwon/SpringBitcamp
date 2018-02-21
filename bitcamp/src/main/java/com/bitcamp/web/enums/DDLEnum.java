package com.bitcamp.web.enums;

public enum DDLEnum {
	CREATE_TABLE_MEMBER{
		@Override
		public String toString() {
			return 
					"CREATE TABLE Member("
							+" id VARCHAR2(20) PRIMARY KEY, "
							+" pass VARCHAR2(20), "
							+" name VARCHAR2(20), "
							+" ssn VARCHAR2(20), "
							+" phone VARCHAR2(20), "
							+" email VARCHAR2(20), "
							+" profile VARCHAR2(20), "
							+" addr VARCHAR2(20) "
							+")";
			
		}
	},
	CREATE_TABLE_ATTEND{
		@Override
		public String toString() {
			return 
					"CREATE TABLE Attend("
					+" seq NUMBER PRIMARY KEY,"
					+" week VARCHAR2(20),"
					+" status VARCHAR2(20),"
					+" id VARCHAR2(20)"
					+")";
					
		}
	}, CREATE_TABLE_BANK {
	    @Override
	    public String toString() {
	      return
	    		  "CREATE TABLE BANK("
	          +"customNum NUMBER PRIMARY KEY, "
	          +"accountNum VARCHAR2(20) not null, "
	          +"money VARCHAR2(20) default 0, "
	          +"id VARCHAR2(20), "
	          +"FOREIGN KEY (id) REFERENCES MEMBER(id)"
	          + "ON DELETE CASCADE"
	          +")";
	    	}
		},CREATE_TABLE_MOBILE {
			@Override
			public String toString() {
				return 
						"CREATE TABLE Mobile("
				          +"customnum NUMBER PRIMARY KEY, "
				          +"mobilenum VARCHAR2(20), "
				          +"regdate  DATE, "
				          +"id  VARCHAR2(20), "
				          +"FOREIGN KEY(id) REFERENCES MEMBER(id)"
				          + " ON DELETE CASCADE"
				          +")";
	}
		},
	INSERT{
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "insert into bank(customnum,accountnum,money,id)values(%s,'%s','%s','%s')";
			}
		},
	PHONE_INSERT{
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "insert into mobile(customnum,mobilenum,regdate,id)values(customnum.nextval,'%s',sysdate,'%s')";
			}
		},
	SYSDATE{
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "select sysdate from dual";
			}
		}
}

