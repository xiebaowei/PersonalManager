<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Internet Dreams</title>
<link rel="stylesheet" href="../css/style.css" type="text/css" media="screen" title="default" />
</head>
<body> 
<div id="content-outer">
<div id="content">
	<table border="0" width="100%" cellpadding="0" cellspacing="0" id="content-table">
	<tr>
		<th rowspan="3" class="sized"><img src="../images/side_shadowleft.jpg" width="20" height="300" alt="" /></th>
		<th class="topleft"></th>
		<td id="tbl-border-top">&nbsp;</td>
		<th class="topright"></th>
		<th rowspan="3" class="sized"><img src="../images/side_shadowright.jpg" width="20" height="300" alt="" /></th>
	</tr>
	<tr>
		<td id="tbl-border-left"></td>
		<td>
		<!--  start content-table-inner ...................................................................... START -->
		<div id="content-table-inner">
		
			<!--  start table-content  -->
			<div id="table-content">
			
				<!--  start message-yellow -->
				
				<table border="0" width="100%" cellpadding="0" cellspacing="0">
				<tr>
					<form action="${pageContext.request.contextPath }/user/listbyid.do" method="get">
                    <td  height="35" align="right">
                    <table width="70%" border="0" cellspacing="0" cellpadding="0" >
                      <tr>
                        <td align="right">ID：</td>
                        <td width="180px"> <input type="text" class="search_input" name="id"></td>
                        <td align="left"><input type="submit" src="../images/top_search_btn.gif"></td>
                      </tr>
                    </table>                
					</td>
					</form>
				</tr>
				</table>
	 
				<!--  start product-table ..................................................................................... -->
				<form id="mainform" action="post">
				<table border="0" width="100%" cellpadding="0" cellspacing="0" id="product-table">
				<tr>
					
					<th class="table-header-repeat line-left minwidth-1 padtp">编号</th>
					<th class="table-header-repeat line-left minwidth-1 padtp">姓名</th>
					<th class="table-header-repeat line-left minwidth-1 padtp">性别</th>
					<th class="table-header-repeat line-left minwidth-1 padtp">薪水</th>
					<th class="table-header-repeat line-left minwidth-1 padtp">部门</th>
					<th class="table-header-repeat line-left minwidth-1 padtp">职务</th>
					<th class="table-header-repeat line-left minwidth-1 padtp">职称</th>
					<th class="table-header-repeat line-left minwidth-1 padtp">操作</th>
					
				</tr>
				<c:forEach items="${Emplist}" var="emp">
                <tr >
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.sex}</td>
					<td>${emp.salary}</td>
					<td>${emp.dept}</td>
					<td>${emp.duty}</td>
					<td>${emp.title}</td>
					<td class="options-width">
					  <a href="${pageContext.request.contextPath }/user/emp_edit.do?id=${emp.id}" title="Edit" class="icon-1 info-tooltip"></a>
					  <a href="${pageContext.request.contextPath }/user/deleteById.do?id=${emp.id}" title="delete" class="icon-2 info-tooltip"></a>
					</td>
				</tr>
                </c:forEach>
				
				</table>
				<!--  end product-table................................... --> 
				</form>
			</div>
			<!--  end content-table  -->
			<div class="clear"></div>
		</div>
		<!--  end content-table-inner ............................................END  -->		</td>
		<td id="tbl-border-right"></td>
	</tr>
	<tr>
		<th class="sized bottomleft"></th>
		<td id="tbl-border-bottom">&nbsp;</td>
		<th class="sized bottomright"></th>
	</tr>
	</table>
	<div class="clear">&nbsp;</div>

</div>
<!--  end content -->
<div class="clear">&nbsp;</div>
</div>
<!--  end content-outer........................................................END -->
 
</body>
</html>
