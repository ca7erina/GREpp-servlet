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
	
		
	
	
		<div class="content">
			
			<div class="sidebar">
				<ul id="menuItems">
				<li class="items"><a href="page/page.action?pageNo=2&pageSize=5">Records</a></li>
				<li class="items"><a href="new.jsp">Add New</a></li>
				<li class="items"><a href="">Search</a></li>
				</ul>
			</div>
			
		
			
			<div class="context">
			<div id = "title"><a>Argument Pool </a> </div>
			<div id ="clock" ><h1 id="clock"></h1></div>
				<div id="show">
					<table id="tabledata">
						 <c:forEach var="a" items="${arguments}" varStatus="status">
						<tr class="row${status.index%2+1 }" >
							<td></td><td>${a.id} . ${a.passage }</td>
							</tr>
						<tr class="row${status.index%2+1 }" >
							<td></td><td>${a.question}</td>
						</tr>
							<tr class="rowNull" >
							<td>  </td><td><a href="">Records</td>
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
				<li class="items"><a href="">Argument Pool</a></li>
				<li class="items"><a href="">Issue Pool</a></li>
				</ul>
				</div>
				
		</div>
		
		
		
		<div id="cleardiv"></div>
		
	</div>

</body>
</html>
