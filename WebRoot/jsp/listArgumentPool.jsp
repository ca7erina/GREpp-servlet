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
	
	
		<%@include file="../common/head.jsp"%>
	
		
	
	
		<div class="content">
			
			<%@include file="../common/sidebarUp.jsp"%>
			
		
			
			<div class="context">
			<div id = "title"><a>Argument Pool </a> </div>
			<div id ="clock" ><h1 id="clock"></h1></div>
				<div id="show">
					<table id="formal1">
						 <c:forEach var="a" items="${arguments}" varStatus="status">
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.id} . ${a.passage }</div></td>
							</tr>
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.question}</div></td>
						</tr>
							<tr class="rowNull" >
							<td><a href="">Detail</td>
						</tr>
						 </c:forEach>
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
