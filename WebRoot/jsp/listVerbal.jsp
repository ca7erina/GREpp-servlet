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
	<meta http-equiv="description" content="imoney">
	
	<link href="css/iCss.css" rel="stylesheet" type="text/css" >
	<script type="text/javascript" src="js/jquery-1.4.3.js"></script>
	<script>
		
		$(function(){
		var s=setInterval(function(){
		
		$("#timer").text(Date());	
		},800);
				
		
		});
	
	</script>
  </head>
  
 <body>
	<div class="container">
	
	
		<%@include file="../common/banner.jsp"%>
	
		
	
	
		<div class="content">
			
			<%@include file="../common/sidebarUp.jsp"%>
			
		
			
			<div class="context">
			<div id = "title"><a>--Budget Left: 600 RMB </a> </div>
			<div id ="clock" ><h1 id="timer">&infin;</h1></div>
				<div id="show">
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								1
							</td>
							<td>
								2
							</td>
							<td>
								3
							</td>
							<td><br>
							<br></td>
						</tr>

						 <c:forEach var="v" items="${verbals}" varStatus="status">
						<tr class="row${status.index%2+1 }" >
							<td>${v.id}</td>
							<td>${v.choice }</td>
							<td>${v.answer }</td>
							<td>${v.answerInfo }</td>
							<td><a href="goProfile.do?id=${u.userid}">Details</a></td>
						</tr>
						
						 </c:forEach>
					</table>
				
				</div>
				<div id="cleardiv"></div>
				<div class="dataform">
					
				</div>
			</div>
			
			
				<div id="sidebar2" class="sidebar">
				<ul id="test">
				<li class="items"><a href="home.jsp">Home</a></li>
				<li class="items"><a href="">Argument</a></li>
				<li class="items"><a href="">Issue</a></li>
				<li class="items"><a href="">Verbal</a></li>
				<li class="items"><a href="">Math</a></li>
				<li class="items"><a href="">Reading</a></li>
				<li class="items"><a href=""></a></li>
				<li class="items"><a href=""></a></li>
				</ul>
				</div>
				
		</div>
		
		
		
		<div id="cleardiv"></div>
		
	</div>

</body>
</html>
