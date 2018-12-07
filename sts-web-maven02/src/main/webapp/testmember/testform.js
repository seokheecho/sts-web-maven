$('#addBtn').click(() => {
    var formData = new Object();
    formData.id = $('#id').val();
    formData.email = $('#email').val();
    formData.password = $('#password').val();

    $.ajax({
        type : "post",
        url : "http://localhost:8080/sts-web-maven/app/testmember/add",
        data : JSON.stringify(formData),
        success : function(data){
            var result = data.result;
            console.log("result=",result);
            if(result != "0"){
                alert('정상적으로 처리되었습니다.');
                window.opener.location.reload();
                window.close();
                } else {
                    alert('정상적으로 처리되지 않았습니다');
                }
            }
    });
});

/*
'use strict'

$.ajaxSetup({
  contentType: "application/json; charset=utf-8"
});

$('#addBtn').click(() => {
    $.post(`http://localhost:8080/sts-web-maven/app/testmember/add`, {
        'id': $('#id').val(),
        'email': $('#email').val(),
        'password': $('#password').val()
    }, (result) => {
        if (result.status === 'success') {
            location.href = 'testsuccess.jsp'
        } else {
            alert('회원 가입 실패!')
            console.log(result.message)
        }
    }, 'json')
    .fail(() => {
        alert('회원 가입 중에 오류 발생!')
    });
});
*/
