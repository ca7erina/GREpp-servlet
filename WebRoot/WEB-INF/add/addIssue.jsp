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
	
	
		<%@include file="../common/banner.jsp"%>
	
		
	
	
		<div class="content">
			
			<%@include file="../common/sidebarUp.jsp"%>
	
			<div class="context">
			<div id = "title"><a>Add Issue</a> </div>
			<div id ="clock" ><h1 id="clock"></h1></div>
			<div id="show">
							<form method="post" action="argument.add" >

					<table id="tableAdd">
						<tr>
								<td>ID in pool :</td>
								<td><input type="text" name="idInPool"/><br/></td>
								<td>    Frequency :</td>
								<td><input type="text" name="frequnce"/><br/></td>
						</tr>
						<tr>
								<td>Type :</td>
								<td><input type="text" name="type"/><br/></td>
								<td>    Show Date :</td>
								<td><input type="text" name="historyDate"/><br/></td>
						</tr>
								
						<tr>
								<td>Passage :</td>
								<td colspan="2"><input type="text" name="passage"/><br/></td>
						</tr>
						<tr>
								<td>Question :</td>
								<td colspan="2"><input type="text" name="question"/><br/></td>
						</tr>
						<tr>
								<td>Answers :</td>
								<td colspan="3"><input type="text" name="answere"/><br/></td>
						</tr>
						<tr>
								<td>Answer Info :</td>
								<td colspan="3"><textarea name="answereInfo"  rows="4" cols="20"></textarea><br/></td>
						</tr>
						<tr>
								<td></td><td></td><<td></td><td><input type="submit"/></td>
						</tr>
						
					</table>
					</form>
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
