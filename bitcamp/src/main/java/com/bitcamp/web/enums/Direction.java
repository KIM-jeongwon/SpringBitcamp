package com.bitcamp.web.enums;

public enum Direction {
	resources,js,image,css,fonts,
	JS{
			@Override
			public String toString() {
				return "/"+"resources"+"/"+"js";
			}
	
},
	IMAGE{

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "/"+"resources"+"/"+"img";
		}
	
},
	CSS{

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "/"+"resources"+"/"+"css";
		}
	
}
}
