package com.bitcamp.web.enums;
public enum Action {
	MOVE,ADD,LOGIN,JOIN,SEARCH,CHANGE_PASS,DELETE,LOGOUT,OPEN_ACCOUNT,CREATE_PHONE,CREATE_TABLE,
	MYPAGE,
	VIEW{
		@Override
		public String toString() {
			return "WEB-INF/view/";
		}
	},
	EXTENSION{
		@Override
		public String toString() {
			return ".jsp";
		}
	},
	SEPARATOR{
		@Override
		public String toString() {
			return "/";
		}
	}
}
