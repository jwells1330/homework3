<!DOCTYPE html>
<!--
Copyright: Jasmine Jones & Jacob Wells
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="/includes/header.html" />
<html>
  <head>
    <title>404 Error</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="styles/main.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
    <header id='errorHeader'>
      <h1>404 Error</h1>
    </header>
    <br>
    <main id='errorMain'>
    <p id='error'>The server was not able to find the file you requested.</p>
    <p id='error'>To continue, click the Back button</p>
    <br>
      <c:import url="/includes/footer.jsp" />
