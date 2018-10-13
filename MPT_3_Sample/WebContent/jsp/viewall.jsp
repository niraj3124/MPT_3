<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr><th>RechargeId</th><th>PlanName</th><th>Amount</th><th>MobileNo</th><th>Description</th><th>DateOfRecharge</th><th>Link</th></tr>
	<c:if test="${!data.isEmpty()}">
	<c:forEach items="${data}" var="recharge">
	<tr>
		<td>${recharge.getRechargeId()}</td>
		<td>${recharge.getPlanName()}</td>
		<td>${recharge.getAmount()}</td>
		<td>${recharge.getMobileNo()}</td>
		<td>${recharge.getDescription()}</td>
		<td>${recharge.getDateOfRecharge()}</td>
		<td><a href="book.do">Recharge</a></td>
	</tr>
	</c:forEach>
	</c:if>
	<c:if test="${data.isEmpty()}">
		<tr><td>No Recharge Info available</td></tr>
	</c:if>
</table>
</body>
</html>