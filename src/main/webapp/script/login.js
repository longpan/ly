$(function(){
	var $submit = $("#submit");
	$submit.click(function(){
		var $userId = $("input[name=username]").val(),
			$password = $("input[name=password]").val(),
			doctor = {
				userId: $userId,
				password: $password
			};
		$.ajax({
			url: "/yl/api/doctor/authentication",
			type: "POST",
			contentType: "application/json",
			data: JSON.stringify(doctor)
		}).done(function(data){
			switch(data.status){
				case 0:
					localStorage.setItem("username", $userId);
					localStorage.setItem("password", $password);
					window.location.href = "query.html";
					break;
				case 7:
					alert("用户不存在！");
					break;
				case 9:
					alert("密码错误！");
					break;
				default: 
					alert("未知错误！");
					break;
			}
		});
	});
});   

