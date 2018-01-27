<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="resources/css/bootstrap.min.css"/>
  <script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
  <script src="resources/js/bootstrap.min.js"></script>
<title>Checking Accounts Monitoring</title>
</head>
<body>
	<div class="container">
		<div class="border rounded" style="height: 420px;overflow:auto">
	      <table class="table">
	        <thead>
	          <tr>
	            <th scope="col" hidden>TID</th>
	            <th scope="col"></th>
	            <th scope="col">DATE</th>
	            <th scope="col">CHECK NO.</th>
	            <th scope="col">PAYEE</th>
	            <th scope="col">RE</th>
	            <th scope="col">ACCOUNT</th>
	            <th scope="col">IN</th>
	            <th scope="col">WITHDRAWAL</th>
	            <th scope="col">DEPOSIT</th>
	          </tr>
	        </thead>
	        <tbody>
	          <tr>
	            <th scope="row" hidden><input type="text" id="TID1" value="1"></th>
	            <th scope="row">
	              <input id="SEL1" type="checkbox">
	            </th>
	            <td>01/03/18</td>
	            <td >3705112</td>
	            <td>Emerson</td>
	            <td>
	              <input id="RE1" type="checkbox" checked disabled>
	            </td>
	            <td>PBB - AMT Realty</td>
	            <td>
	              <input id="IN1" type="checkbox" checked disabled>
	            </td>
	            <td>51,263.33</td>
	            <td></td>
	          </tr>
	          <tr>
	            <th scope="row" hidden><input type="text" id="TID2" value="2"></th>
	            <th scope="row">
	              <input id="SEL2" type="checkbox">
	            </th>
	            <td>01/03/18</td>
	            <td>72085</td>
	            <td>Hi-Top</td>
	            <td>
	              <input id="RE2" type="checkbox" checked disabled>
	            </td>
	            <td>Land Bank - CA AMT Realty</td>
	            <td>
	              <input id="IN2" type="checkbox" disabled>
	            </td>
	            <td>58,639.00</td>
	            <td></td>
	          </tr>
	          <tr>
	            <th scope="row" hidden><input type="text" id="TID3" value="3"></th>
	            <th scope="row">
	              <input id="SEL3" type="checkbox">
	            </th>
	            <td>01/05/18</td>
	            <td></td>
	            <td>CASH DEPOSIT</td>
	            <td>
	              <input id="RE3" type="checkbox" disabled>
	            </td>
	            <td>PBB - AMT Realty</td>
	            <td>
	              <input id="IN3" type="checkbox" disabled>
	            </td>
	            <td></td>
	            <td>58,000</td>
	          </tr>
	        </tbody>
	      </table>
	    </div>
	    
		<c:if test="${!empty listTransaction}">
			<table class="table">
				<tr>
				    <th>ID</th>
				    <th>DATE ISSUED</th>
				    <th>CHECK NO</th>
				    <th>ACCOUNT</th>
				    <th>WITHDRAWAL AMOUNT</th>
				    
				
				</tr>
				<c:forEach items="${listTransaction}" var="transaction">
				<tr>
				    <td>${transaction.id}</td>
					<td><fmt:formatDate value="${transaction.dateIssued}" pattern="MM/dd/yyyy" /></td>
					<td>${transaction.checkNo}</td>
					<td>${transaction.accountId.getDescription()}</td>
					<td><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${transaction.withdrawalAmt}" /></td>
				</tr>
				</c:forEach>
				</table>
		</c:if>

    </div>
</body>
</html>