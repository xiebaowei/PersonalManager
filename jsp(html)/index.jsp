<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="GBK"%>
<% String path = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>login</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="<%=path%>/css/style2.css" />
	</head>

	<body>
		<div id="wrap">
			<div id="top_content">
					<div id="header">
						<div id="rightheader">
							<p>
							
								<br />
							</p>
						</div>
						<div id="topheader">
							<h1 id="title">
								<a href="#" style="display: block; text-align: center;">人事管理系统欢迎您！</a>
							</h1>
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						用户登录
					</h1>
					<form action="${pageContext.request.contextPath }/user/login.do" method="post" target="-top">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
								 <h1>	用户名： </h1>
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="username" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
								<h1>	密    码：          </h1>
								</td>
								<td valign="middle" align="left">
									<input type="password" class="inputgri" name="password" />
								</td>
							</tr>
							
						</table>
								
						<p>
						
							<input type="submit" class="button" style="width: 100px;height: 40px;" value="登陆    &raquo;" />&nbsp; &nbsp; &nbsp;&nbsp;&nbsp; &nbsp; &nbsp;&nbsp;
							<input type="button" class="button" style="width: 100px;height: 40px;" value="注册    &raquo;" onclick="location='${pageContext.request.contextPath }/html/user_add.jsp'"/>
							<div style = "color : red">${ error }</div>
						</p>
						
					</form>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
				</div>
			</div>
		</div>
	</body>
</html>
    
