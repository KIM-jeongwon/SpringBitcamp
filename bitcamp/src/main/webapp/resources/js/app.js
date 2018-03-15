/*
 * 공통 JavaScript 기능
 * */
var app = app || {};
var route = route || {};

app=(()=>{
	var init=x=>{
		route.init(x);
		onCreate();
	};
	var onCreate=()=>{
		setContentView();
		app.board.init();
	};
	var setContentView=()=>{
		move("main/home");	
	};
	var move = x=>{
		location.href= route.$()+"/move/"+x
	};
	var boardList=x=>{
		app.board.list(x);
	};
	return {
		init:init,
		move:move,
		boardList:boardList
	};
})();
app.board = (()=>{
	var init=()=>{
		onCreate();
	};
	var onCreate=()=>{
		setContentView();
		list();
	};
	var setContentView=()=>{
		
	};
	var list=x=>{
		location.href= route.$()+"/board/list?pageNum="+x;
	};
	return {
		onCreate:onCreate,
		list:list
	};
})();

route = (()=>{

	return {
		init:x => {
			alert('컨떽스트'+x);
			sessionStorage.setItem('x',x);},
			$:x=>
			{return sessionStorage.getItem('x');},
			$s:()=>
			{return sessionStorage.getItem('x')+'/resources/js';},
			$c:()=>
			{return sessionStorage.getItem('x')+'/resources/css';},
			$i:()=>
			{return sessionStroage.getItem('x')+'/resources/img';}
	}
})();
