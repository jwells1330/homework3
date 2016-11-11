<%-- 
    Document   : calculate
    Created on : Oct 25, 2016, 3:14:39 PM
    Copyright  : Jasmine Jones & Jacob Wells & Sarah Allen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="elon" uri="/WEB-INF/tlds/elon.tld" %>
<c:import url="/includes/header.html" />

<table id="values">
  <tr>
    <td id="right"><label>Investment Amount:</label></td>
    <td><span><elon:currencyFormat value="${calculation.investment}"/></span></td>
  </tr>

  <tr>
    <td id="right"><label>Yearly Interest Rate:</label></td>
    <td><span>${calculation.interest}</span></td>
  </tr>

  <tr>
    <td id="right"><label>Number of Years:</label></td>
    <td><span>${calculation.years}</span></td>
  </tr>

  <tr>
    <th>Year</th>
    <th>Value</th>
  </tr>   
  
  <c:forEach var="i" begin="0" end = "${calculation.years - 1}">
    <tr>
      <td id="years"><label><c:out value = "${i+1}"/></label></td>
      <td><span><elon:currencyFormat value="${calculation.valuesList[i]}"/></span></td>
    </tr>
  </c:forEach>

    <tr>
      <td>
        <form id="form" action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" id="return" value="Return to Calculator">
    </form>
      </td>
    </tr>
</table>


    
<c:import url="/includes/footer.jsp" />
