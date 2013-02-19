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
	
		<link href="/GREpp-servlet/css/iCss.css" rel="stylesheet" type="text/css" >
	<script type="text/javascript" src="/GREpp-servlet/js/jquery-1.4.3.js"></script>
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
			<div id = "title"><a>Rest:  </a> </div>
			
				<div id="show">
						<table id>
							 <c:forEach var="a" items="${issues}" varStatus="status">
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.id} . ${a.passage }</div></td>
							</tr>
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.question}</div></td>
						</tr>
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.answereInfo}</div></td>
						</tr>
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.answere}</div></td>
						</tr>
						
						 </c:forEach>
						 <tr class="rowNull" >
							<td><a href="issue.list?iftaken=${iftaken}&page=${page+1}&pagesize=${pagesize}">Next</a></td>
						</tr>
					</table>
						<table id>
						 <c:forEach var="v" items="${verbals}" varStatus="status">
						<tr class="row${status.index%2+1 }" >
							<td>${v.id}</td>
							<td>${v.choice }</td>
							<td>${v.answer }</td>
							<td>${v.answerInfo }</td>
							<td><a href="goProfile.do?id=${u.userid}">Details</a></td>
						</tr>
						
						 </c:forEach>
						 <tr class="rowNull" >
							<td><a href="verbal.list?iftaken=${iftaken}&page=${page+1}&pagesize=${pagesize+1}"">Next</a></td>
						</tr>
					</table>
						<table id>
						 <c:forEach var="a" items="${maths}" varStatus="status">
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.id} . ${a.passage }</div></td>
							</tr>
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.question}</div></td>
						</tr>
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.answereInfo}</div></td>
						</tr>
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.answere}</div></td>
						</tr>
						
						 </c:forEach>
						 <tr class="rowNull" >
							<td><a href="math.list?iftaken=${iftaken}&page=${page+1}&pagesize=${pagesize}"">Next</a></td>
						</tr>
					</table>
						<table id>
						 <c:forEach var="a" items="${readings}" varStatus="status">
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.id} . ${a.passage }</div></td>
							</tr>

							 <c:forEach var="c" items="${a.readingverbals}" varStatus="st">
								<tr class="row${(status.index+1)%2+1 }" >
									<td ><div class="block${status.index%2+1 }">${status.index+1}.${st.index+1}.${c.question}<br/>
									<c:forEach var="o" items="${c.choice}" >
										    ${o.key}.${o.value}.<br/>
										</c:forEach>
										${c.answer}${c.answerInfo}<br/>
										
									</div></td>
								</tr>
							</c:forEach>
							<tr class="rowNull" >
							<td><a href="reading.list?iftaken=${iftaken}&page=${page+1}&pagesize=${pagesize}"">Next</a></td>
						</tr>
						
						 </c:forEach>
					</table>
					<table id>
						 <c:forEach var="a" items="${arguments}" varStatus="status">
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.id} . ${a.passage }</div></td>
							</tr>
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.question}</div></td>
						</tr>
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.answereInfo}</div></td>
						</tr>
						<tr class="row${status.index%2+1 }" >
							<td ><div class="block${status.index%2+1 }">${a.answere}</div></td>
						</tr>
						
						 </c:forEach>
						 <tr class="rowNull" >
							<td><a href="argument.list?iftaken=${iftaken}&page=${page+1}&pagesize=${pagesize}"">Next</a></td>
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
