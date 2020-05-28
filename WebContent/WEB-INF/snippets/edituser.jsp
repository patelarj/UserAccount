<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="myt" tagdir="/WEB-INF/tags/" %>
    
<form method=post>
<table class="center">
	<!--  <tr><td colspan=2><span style="color:red;">${param.msg}</span></td></tr> -->
		
	<tr><td colspan=2><myt:error color="yellow" size="12px">${param.msg}</myt:error></td></tr>
	<tr><td colspan=2><h2>Edit User</h2></td></tr>
	<tr>
		<td align=left>Name: </td>
		<td><input type=text name=name value="${name}"></td>
	</tr>
	<tr>
		<td align=left>Login Name: </td>
		<td><input type=text name=lname value="${lname}" ></td>
	</tr>
	<tr>
		<td align=left>New Password: </td>
		<td><input type=password name=pass value="${pass}" ></td>
	</tr>
	<tr><td colspan=2><input type=submit value=edit></td></tr>
</table>
</form>