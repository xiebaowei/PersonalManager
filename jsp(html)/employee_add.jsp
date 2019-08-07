<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath();%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Internet Dreams</title>
<link rel="stylesheet" href="../css/style.css" type="text/css" media="screen" title="default" />

</head>
<body>
<!-- start content-outer -->
<div id="content-outer">
  <!-- start content -->
  <div id="content">
    <table border="0" width="100%" cellpadding="0" cellspacing="0" id="content-table">
      <tr>
        <th rowspan="3" class="sized"><img src="../images/side_shadowleft.jpg" width="20" height="230" alt="" /></th>
        <th class="topleft"></th>
        <td id="tbl-border-top">&nbsp;</td>
        <th class="topright"></th>
        <th rowspan="3" class="sized"><img src="../images/side_shadowright.jpg" width="20" height="230" alt="" /></th>
      </tr>
      <tr>
        <td id="tbl-border-left"></td>
        <td>
        <!--  start content-table-inner -->
        <div id="content-table-inner">
          <table border="0" width="100%" cellpadding="0" cellspacing="0">
           
            <tr>
            <td height="50" valign="top"><div class="error-left"></div>
             <div class="error-inner">
               <h3 class="add">您当前的位置：添加用户信息</h3>
             </div>
             </td>
            </tr>
            <tr valign="top">
              <td>
              <!-- start id-form -->
              <form action="${pageContext.request.contextPath }/evalu/insertemp.do" method="post">
              <table border="0" cellpadding="0" cellspacing="0"  id="id-form">
                
                <tr>
                  <th valign="top">员工ID:</th>
                  <td><input type="text" class="inp-form-error large_input" name="eid"/ ></td>
                  <td><div class="error-left"></div>
                    <div class="error-inner">必填项* </div></td>
                </tr>
                
                <tr>
                  <th valign="top">姓 名：</th>
                  <td><input type="text" class="inp-form-error large_input" name="name"/></td>
                  <td><div class="error-left"></div>
                    <div class="error-inner">必填项* </div></td>
                </tr>
                <tr>
                  <th valign="top">性 别：</th>
                   <td><select name="sex"   style="width:200px; height:27px" >
                  <option value="男" > 男</option>
                  <option value="女" > 女</option>
					  </select></td>
					   <td><div class="error-left"></div>
                    <div class="error-inner">必填项* </div></td>
                  
                </tr>
                <tr>
                  <th valign="top">薪 水：</th>
                  <td><input type="text" class="inp-form-error large_input" name="salary" /></td>
                    <td><div class="error-left"></div>
                    <div class="error-inner">薪水格式只能是数字 </div></td>
                </tr>
                
                 <tr>
                  <th valign="top">部 门：</th>
                  <td><select name="deid" size=""  style="width:200px; height:27px" >
                  <option value="" style="display: none"></option>
                  	<c:forEach items="${deptList}" var="dept">
						<option value="${dept.id}">${dept.dename }</option>
					</c:forEach>
					  </select> </td>
					   <td><div class="error-left"></div>
                    <div class="error-inner">必填项* </div></td>
                 </tr>
                <tr>
                  <th valign="top">职 务：</th>
                  <td><select name="duid" size=""  style="width:200px; height:27px" >
                  <option value="" style="display: none"></option>
                  	<c:forEach items="${dutyList}" var="duty">
						<option value="${duty.id}">${duty.duname }</option>
					</c:forEach>
					  </select> </td>
					   <td><div class="error-left"></div>
                    <div class="error-inner">必填项* </div></td>
               </tr>
               
                <tr>
                  <th valign="top">职 称：</th>
                  <td><select name="titid" size=""  style="width:200px; height:27px" >
                  <option value="" style="display: none"></option>
                  	<c:forEach items="${titleList}" var="title">
						<option value="${title.id}">${title.tname }</option>
					</c:forEach>
					  </select> </td>
					   <td><div class="error-left"></div>
                    <div class="error-inner">必填项* </div></td>
               </tr>
               
                <tr>
                
                  <th>&nbsp;</th>
                  <td valign="top"><input type="submit" value="" class="form-submit" />
                  </td>
                  <td><div style = "color : red">${ error }</div></td>
                </tr>
              </table>
              <!-- end id-form  -->
              </form>
            </td>
            </tr>
            
          </table>
          <div class="clear"></div>
        </div>
        <!--  end content-table-inner  -->
        </td>
        <td id="tbl-border-right"></td>
      </tr>
      <tr>
        <th class="sized bottomleft"></th>
        <td id="tbl-border-bottom">&nbsp;</td>
        <th class="sized bottomright"></th>
      </tr>
    </table>
  </div>
  <!--  end content -->
  <div class="clear">&nbsp;</div>
</div>
<!--  end content-outer -->
</body>
</html>
