<%@ page import="testpack.Item,java.util.ArrayList" language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="mytags" uri="http://arjun" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table class="center" width="70%">
	<tr>
		<td align=left><mytags:wName color="green" size="13px">Welcome:${name}</mytags:wName></td>
		<td align=right>
			<a href="EditAccount">Edit Account</a> 
			<a href="Logout">LogOut</a>
		</td>
	</tr>
	<tr>
		<td colspan=2 align=center>
			<h2>List of Items</h2>
			
			<table class="center">
				<tr><th>Actions</th><th>Item Name</th><th>Quantity</th></tr>
				<c:forEach var="user" items="${allItems}">
							<tr>
								<td>
									<a href="ViewItem?id=${user.id }">View</a> 
									<a href="EditItem?id=${user.id }">Edit</a> 
									<a href="DeleteItem?id=${user.id }">Delete</a>
								</td>
								<td>${user.name }</td>
								<td>${user.qty} </td>
							</tr>
				</c:forEach>
			</table>
		</td>	
	</tr>
</table>
<a href="AddItem">Add Item</a>