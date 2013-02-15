<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
       
    <title>GRE</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="gre">
	
		<link href="../css/iCss.css" rel="stylesheet" type="text/css" >
	<script type="text/javascript" src="../js/jquery-1.4.3.js"></script>
	<script>
		
		$(function(){
		var s=setInterval(function(){
		
		$("#clock").text(Date());	
		},800);
				
		
		});
	
	</script>
  </head>
  
 <body>
	<div class="container">
	
	
		<div class="header"><img src="../img/gre_header_logo_105x72.jpg" style="margin:0px auto"></div>
	
		<div id ="clock" ><h1 id="timer">&infin;</h1></div>
	
	
		<%@include file="../common/sidebarUp.jsp"%>
			
		
			
			<div class="context">
			<div id = "title"><a>Home</a> </div>
				<div id="show" align="center">
					<table class="table" >
					<tr><td colspan="3"><div class="block3">Taking exercises</div></td></tr>
						<tr>
							<td>
								<div class="block1">Take a Verbal</div>
							</td>
							<td>
									<div class="block1">Take a Reading</div>
							</td>
							<td>
								<div class="block1">Take a Math</div>
							</td>
							</tr>
							<tr>
							<td>
								<div class="block1">Take an Issue Writing</div>
							</td>
							<td>
							   <div class="block1">Take an Argument Writing</div>
							</td>
							</tr>
							<td colspan="3">
							   <div class="block1">Take an exam :Verbal +Reading + Math</div>
							</td>
						<tr>
							<td colspan="3">
								<div class="block3">Review</div>
							</td>
							</tr>
							<tr>
							<td>
									<div class="block2"> Reading</div>
							</td>
							<td>
								<div class="block2"> Math</div>
							</td>
							<td>
								<div class="block2"> Verbal</div>
							</td>
							</tr>
							<tr>
							<td>
								<div class="block2"> Issue Writing</div>
							</td>
							<td>
							   <div class="block2"> Argument Writing</div>
							</td>
							</tr>
							<tr>
							<td colspan="3">
							   <div class="block2">Take an exam :Verbal +Reading + Math</div>
							</td>
						</tr>
						

						 <c:forEach var="v" items="${verbals}" varStatus="status">
						<tr class="row${status.index%2+1 }" >
							<td>${v.id}</td>
							<td>${v.choice }</td>
							<td>${v.answer }</td>
							<td>${v.answerInfo }</td>
							<td><a href="goProfile.do?id=${a.id}">Details</a></td>
						</tr>
						
						 </c:forEach>
				
					<tr><td colspan="3"><div class="block3">Favorite</div></td></tr>
						<tr>
							<td>
								<div class="block1">Verbal</div>
							</td>
							<td>
									<div class="block1">Reading</div>
							</td>
							<td>
								<div class="block1">Math</div>
							</td>
							</tr>
							<tr>
							<td>
								<div class="block1"> Issue Writing</div>
							</td>
							<td>
							   <div class="block1">Argument Writing</div>
							</td>
							</tr>
					</table>
					
				</div>
				<div id="cleardiv"></div>
				<div class="dataform">
					
				</div>
			</div>
			
			
				<%@include file="../common/sidebarDown.jsp"%>
				
		</div>
		
		
		
		<div id="cleardiv"></div>
		
	</div>

</body>
</html>
