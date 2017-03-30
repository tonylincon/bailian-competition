$(document).ready(function() {

	$("#login_form").click(function() {
		var dataUrl = "/login";
		$.ajax({
			url : dataUrl,
			dataType : 'json',
			data : {
				name : $("#username").val(),
				password : $("#password").val()
			},
			type : "POST",
			scriptCharset : 'utf-8',
			success : function(o) {
				if (o.resCode == "1000000") {
					location.href = "/list.html";

//				} else {
//					$("#myAlert").alert('close');
				}
//			},
//			error : function(o) {
//				$("#myError").alert('close');
			}
		});
	});

});
