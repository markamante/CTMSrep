<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<spring:url value="/resources/css/footer.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
</head>

<body>
	<div class="footer">
		<div id="container">
			<div id="cont">
				<div class="footer_center">
					<p align="center">Check Transactions Monitoring</p>
				</div>
			</div>
		</div>
	</div>

</body>
</html>