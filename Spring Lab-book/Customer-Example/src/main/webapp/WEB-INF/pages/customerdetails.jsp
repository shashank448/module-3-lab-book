<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<h2>
Id is  <c:out value="${customer.customerId}"/>
Name is <c:out value="${customer.customerName}"/>
</h2>
</body>
</html>