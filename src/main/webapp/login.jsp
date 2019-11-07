<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/index_work.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
用户:<input type="text" name="username" id="username"><br><br>
密码:<input type="text" name="password" id="password"><br><br>
<input type="button" onclick="login()" value="登录">
<input type="reset" value="登录">
</form>

<script type="text/javascript">

function login(){
	var username=$("#username").val();
	var password=$("#password").val();
	var check=true;
	
	if (username=="") {
		alert("账号不能为空");
		check=false;
	}else if (password=="") {
		alert("密码不能为空");
		check=false;
	}
	if (check) {
		$.post("/login",$("form").serialize(),function(num){
			if (num) {
				alert("登录成功");
				location="/list";
			}else {
				alert("登录失败");
				location="/list";
			}
		},"json")
	}
	
}


</script>

</body>
</html>