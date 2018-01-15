<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaction </title>

<spring:url value="/resources/css/mainForMenu.css" var="mainCss" />
<spring:url value="/resources/css/menu.css" var="menuHover" />
<spring:url value="/resources/css/transactionalCss.css" var="webForm" />
<link href="${mainCss}" rel="stylesheet" />
<link href="${menuHover}" rel="stylesheet" />
<link href="${webForm}" rel="stylesheet" />
</head>
<body>
  <jsp:include page="/WEB-INF/views/menuBar.jsp"/>
</body>
</html>