<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>
	<head>
	
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="imoney">
		
		<link href="css/iCss.css" rel="stylesheet" type="text/css" >

	<script src="js/jquery-1.4.3.js"> </script>
	
	</head>
	<body >
	<%@include file="../common/head.jsp"%>
		<div class="simple">
<span style="color:#ff0000 "><%=request.getAttribute("loginError")==null? "": (String)request.getAttribute("loginError")%></span>
		<form action="login.action" >
		Username:<input type="text" name="username"/><br/>
		Password:<input type="text" name="password"/><br/>
		<input type="submit"/>
		
		</form>
		</div>

	</body>
</html>