/*
 * 공통 JavaScript 기능
 * */


var board = board || {};
var route = route || {};
/* 니꺼 */
/*board = (()=>{
	return {init:x=>{
			route.init(x);
			location.href= route.$()+"/move/main/home"}};
	var list = x=>{
		location.href= route.$()+"/board/list";
	};
	return{init:init};
})();*/

/* 내꺼 */
board = (()=>{
    return {init:x =>{
                route.init(x);
                location.href= route.$()+"/move/main/home";
            },
            list:x =>{
                location.href= route.$()+"/board/list";
                
            }};
})();

route=(()=>{
	return {
		init:x =>{sessionStorage.setItem('x',x);},
		$:x =>
		{return sessionStorage.getItem('x');},
		$s:() =>
		{return sessionStorage.getItem('x')+'/resources/js';},
		$c:() =>
		{return sessionStorage.getItem('x')+'/resources/css';},
		$i:() =>
		{return sessionStorage.getItem('x')+'/resources/png';}
	}
})();
