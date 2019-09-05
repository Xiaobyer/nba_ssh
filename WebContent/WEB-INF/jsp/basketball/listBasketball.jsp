<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="s" uri="/struts-tags" %>


<%@page isELIgnored="false"%>


<div style="margin:0px auto; width:500px">
<table cellspacing="0" border="1" width="80%">
	<tr>
		<td>id</td>
		<td>name</td>
		<td>team</td>
		<td>编辑</td>
		<td>删除</td>
		
	</tr>
	    	    
<s:iterator value="basketballs" var="p">
	<tr>
		<td>${p.id}</td>
		<td>${p.name}</td>
		<td>${p.team}</td>		
		<td><a href="editBasketball?basketball.id=${p.id}">编辑</a></td>
		<td><a href="deleteBasketball?basketball.id=${p.id}">删除</a></td>		
	</tr>
</s:iterator>

</table>

<br>
<br>

<form action="addBasketball" method="post">
id: <input name="basketball.id" size="3"> 
name: <input name="basketball.name"  size="9"> 
team: <input name="basketball.team" size="9"> 
<button type="submit">新增</button>

</form>
</div>