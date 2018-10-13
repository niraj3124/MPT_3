<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recharge</title>
</head>
<body>

<form:form action="store.do" modelAttribute="rechObj" method="POST">
Plan Name:<form:input path="planName"/><br><br>
Amount:<form:input path="amount"/><br><br>
Mobile No:<form:input path="mobileNo"/><br><br>
Description:<form:input path="description"/><br><br>
Date Of Recharge:<form:input path="dateOfRecharge"/><br><br>
<input type="submit" value="Recharge"/>
</form:form>

</body>
</html>