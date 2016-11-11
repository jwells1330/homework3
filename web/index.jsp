<%-- 
    Document   : index
    Created on : Oct 25, 2016, 2:46:42 PM
    Author     : Jasmine
    Copyright  : Jasmine Jones & Jacob Wells
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/includes/header.html" />

<form method="post" action="calculate">
  <input type="hidden" name="action" value="add">
  <p><label>Investment Amount:</label>
    <input name="amount" type="number" autofocus min='0' value="${sessionScope.investment}" required/></p>
  <p><label>Yearly Interest Rate:</label>
    <input name="interest" type="number" min='0' value="${sessionScope.interest}" required/></p>
  <p><label>Number of Years:</label>
    <input name="years" type="number" min='0' placeholder="Integer number of years" required/></p>
  <p><input id="submit" type="submit" value="Calculate"/></p>
</form>

<c:import url="/includes/footer.jsp" />
