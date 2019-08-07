<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户管理</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery-1.4.1.min.js"></script>
<script type="text/javascript" src="../js/simpla.jquery.configuration.js"></script>
</head>
<body>
<div id="sidebar"><div id="sidebar-wrapper">
			<div id="profile-links" class="mypng"><img src="../images/logo.png"  />
          您好 <a href="main.jsp" target="mainFrame">我的桌面</a><br />
					<br>
				<a href="../index.jsp" title="Sign Out" target="_top">退出登陆</a>            </div>        

			<ul id="main-nav">
				<li> 
					<a href="#" class="nav-top-item ">用户信息管理</a>
					<ul>
						<li><a href="${pageContext.request.contextPath }/user/list.do" target="mainFrame">用户信息列表</a></li> 
						<li><a href="${pageContext.request.contextPath }/evalu/add.do" target="mainFrame">添加用户信息</a></li> 
					</ul>
				</li>
				<li>
					<a href="#" class="nav-top-item">考评信息管理</a>
					<ul>
						<li><a href="${pageContext.request.contextPath }/evalu/list.do" target="mainFrame">考评信息列表</a></li>
						<li><a href="${pageContext.request.contextPath }/html/test_add.jsp" target="mainFrame">添加考评信息 </a></li>
					</ul>
				</li>
				<li>
					<a href="#" class="nav-top-item">培训信息管理</a>
					<ul>
						<li><a href="${pageContext.request.contextPath }/train/list.do" target="mainFrame">培训信息列表</a></li>
						<li><a href="${pageContext.request.contextPath }/html/train_add.jsp" target="mainFrame">添加培训信息</a></li>
					</ul>
				</li>
				<li>
					<a href="#" class="nav-top-item">员工调动管理</a>
					<ul>
						<li><a href="${pageContext.request.contextPath }/move/list.do" target="mainFrame">调动信息列表</a></li>
						<li><a href="${pageContext.request.contextPath }/move/add.do" target="mainFrame">添加调动信息</a></li>
					</ul>
				</li>

				
				
			</ul> 
			
			<div id="messages" style="display: none"> 
				
				<h3>3 Messages</h3>
				<p>
					<strong>17th May 2009</strong> by Admin<br />
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus magna. Cras in mi at felis aliquet congue.
					<small><a href="#" class="remove-link" title="Remove message">Remove</a></small>				</p>
				<p>
					<strong>2nd May 2009</strong> by Jane Doe<br />
					Ut a est eget ligula molestie gravida. Curabitur massa. Donec eleifend, libero at sagittis mollis, tellus est malesuada tellus, at luctus turpis elit sit amet quam. Vivamus pretium ornare est.
					<small><a href="#" class="remove-link" title="Remove message">Remove</a></small>				</p>
			 
				<p>
					<strong>25th April 2009</strong> by Admin<br />
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus magna. Cras in mi at felis aliquet congue.
					<small><a href="#" class="remove-link" title="Remove message">Remove</a></small>				</p>
				
				<form action="#" method="post">
					
					<h4>New Message</h4>
					
					<fieldset>
						<textarea class="textarea" name="textfield" cols="79" rows="5"></textarea>
					</fieldset>
					
					<fieldset>
					
						<select name="dropdown" class="small-input">
							<option value="option1">Send to...</option>
							<option value="option2">Everyone</option>
							<option value="option3">Admin</option>
							<option value="option4">Jane Doe</option>
						</select>
						
						<input class="button" type="submit" value="Send" />
					</fieldset>
				</form>
			</div> 		
		</div></div>
</body>
</html>
