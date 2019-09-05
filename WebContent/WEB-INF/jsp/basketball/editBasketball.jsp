<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="s" uri="/struts-tags" %>


<%@page isELIgnored="false"%>


<div style="margin:0px auto; width:500px">


<form action="updateBasketball" method="post">
id:<input name="basketball.id"  value="${basketball.id}"  size="3"> 
name: <input name="basketball.name" value="${basketball.name}" size="9"> 
team: <input name="basketball.team" value="${basketball.team}" size="9"> 

<button type="submit">提交</button>

</form>
</div>