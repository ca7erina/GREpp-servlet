<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>tv</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="imoney">
		<link href="css/iCss.css" rel="stylesheet" type="text/css">
		<script src="js/jquery-1.4.3.js"></script>
	</head>
	<body>
		<div class="container">
			<div class="header"><img src="img/logo3.png" height="147" width="449" style="margin: 0px auto"></div>
			<div class="content">
				<div class="context" style="width:960px">
					<div class="dataform">
						<h1 align="center">
							<font color="#17f787"><strong><a href="list.action">Home</a></strong></font>
						</h1>
					</div>
				<form action="delete.action" method="post">
				
					<table>
					<tr><td><input  name="submit" type="submit" value="delete" /></td></tr>
					</table>
				
				
				
					<table >
						<tbody>
							<tr id="tablehead" align="center">
								<td width="5%">Del</td>
								<td width="10%"><a href="/TVrecord/listAll.action?col=name">Name</a></td>
								<td width="5%">Ihave</td>
								<td width="8%">Wateched</td>
								<td width="7%">Newest</td>
								<td width="4%"><a href="/TVrecord/listAll.action?col=rate">Rate</a></td>
								<td width="24%">Online</td>
								<td width="24%">&#8595</td>
								<td width="10%">File</td>
							
							</tr>
						</tbody>
						<tbody>
							<s:iterator value="videos" status="status">
								<tr align="center" class="row${status.count%2+1}">
									<td><input type="checkbox" name="ids" value="${id}" /></td>
									<td ><a href="goModify.action?id=<s:property value="id"/>"><s:property value="name" /></a></td>
									<td>S<s:property value="haveSe" />e<s:property value="haveEp" /></td>
									<td>S<s:property value="watchedSe" />e<s:property value="watchedEp" /></td>
									<td>S<s:property value="newestSe" />e<s:property value="newestEp" /></td>
									<td><s:property value="rate" /></td>
									<td><s:property value="watchUrl" /></td>
									<td><s:property value="downloadUrl" /></td>
									<td><s:property value="filePath"/></td>
									
								</tr>
							</s:iterator>
						</tbody>
					</table>
					</form>
					<br/>
				</div>
			</div>
	</div>
	</body>
</html>
