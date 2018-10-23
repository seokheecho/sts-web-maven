$(function(){
	init();
});

function login(){
	var formData = {};
	formData.radioCheck = $("input:radio[name='radioCheck']:checked").val();
	formData.id = $('#id').val();
	formData.pw = $('#pw').val();

	$.ajax({
		url : prefix + "/login",
		type : "post" ,
		data : JSON.stringify(formData),
		success : function(data){
			if(data.result == 'success'){
                localStorage.setItem("lastYearMonth", '');

				$.cookie('SESSION_USER_ID', data.id, {
			        expires: 1,	// 1일 보관
			        path: '/'
			    });
				$.cookie('SESSION_USER_NAME', data.name, {
			        expires: 1,	// 1일 보관
			        path: '/'
			    });
				$.cookie('SESSION_CHECK_ID', data.type, {
			        expires: 1,	// 1일 보관
			        path: '/'
			    });

				location.href ="../main/frame.html";
			}else if( data.result == 'fail' ){
				alert("입력 정보를 확인해 주세요.");
			}else{
				console.log(data.result);
			}
		}
	});
}

function init(){
	var loginToken = $.cookie('loginToken');
	if(loginToken != null && loginToken != undefined){
		location.href = "../main/frame.html";
	}

	$("input:radio[name='radioCheck'][value='1']").prop('checked', true);
	$("input:radio[name='radioCheck'][value='2']").prop('checked', false);

	$('#login').on('click', login);
}
