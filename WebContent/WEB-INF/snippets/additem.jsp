<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<form method=post>
<table class="center">
	<tr><td colspan=2><span style="color:red;">${msg}</span></td></tr>
	<tr><td colspan=2><h2>Add Item</h2></td></tr>
	<tr>
		<td align=left>Name: </td>
		<td><input type=text name=iname></td>
	</tr>
	<tr>
		<td align=left>Quantity: </td>
		<td><input type=text name=iqua></td>
	</tr>
	<tr><td colspan=2><input type=submit value=Add></td></tr>
</table>
</form>