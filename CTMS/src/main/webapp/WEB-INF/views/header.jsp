<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<spring:url value="/resources/css/NavigationCss.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
</head>
<body>

<div class="headerMain">
		<div class="header_center">
		<div class="companyName">COMPANY</div>
	    </div>
		
		<div class="icon-bar">
		  <a href="#"><i class="fa fa-calculator"></i><div class="NavCaption">TRANSACTIONS</div> </a> 
		  <a href="#"><i class="fa fa-calendar"></i><div class="NavCaption">JOURNAL</div> </a> 
		  <a href="#"><i class="fa fa-laptop"></i><div class="NavCaption">SYSTEM ADMIN</div> </a> 
		  <a href="#"><i class="fa fa-power-off"></i><div class="NavCaption">LOG OUT</div></a> 
		</div>
</div>
        
</body>
</html>