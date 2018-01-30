<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="resources/css/bootstrap.min.css"/>
  <script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
  <script src="resources/js/bootstrap.min.js"></script>
<title>Transactions Page</title>
</head>
<body>
	<div class="container">
		
		<!-- TRANSACTIONS TABLE HEADER AND MODAL BUTTONS-->
		<div class="float-left">
		  <h4>TRANSACTIONS</h4>
		</div>
		<div class="float-right">
		  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#addTxnModalCenter">
		    Add
		  </button>
		  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#editTxnModalCenter">
		    Edit
		  </button>
		  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#delTxnModalCenter">
		    Delete
		  </button>
		</div>
		<div class="clearfix"></div>
		<br/>
		
		<!-- TRANSACTION TABLE -->
		<div class="border rounded" style="height: 420px;overflow:auto">
			<c:if test="${!empty listTransaction}">
			<table class="table">
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
				<c:forEach items="${listTransaction}" var="transaction">
				<tr>
					<th scope="row" hidden>${transaction.id}</th>
		            <th scope="row">
		              <input id="SELTXN${transaction.id}" type="checkbox">
		            </th>
		            <td><fmt:formatDate value="${transaction.dateIssued}" pattern="MM/dd/yyyy" /></td>
		            <td >${transaction.checkNo}</td>
		            <td>PAYEE HERE</td>
		            <td>
		              <input type="checkbox" disabled
		              	<c:choose>
						    <c:when test="${transaction.recurFlag}"> checked </c:when>
					    </c:choose>
					   >
		            </td>
		            <td>${transaction.accountId.getDescription()}</td>
		            <td>
		              <input type="checkbox" disabled
		              	<c:choose>
						    <c:when test="${transaction.inFlag}"> checked </c:when>
					    </c:choose>
					   >
		            </td>
		            <td>
		            	<c:choose>
						    <c:when test="${transaction.withdrawalAmt le 0}">
								<!-- blank -->
						    </c:when>    
						    <c:otherwise>
									<fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${transaction.withdrawalAmt}" />
						    </c:otherwise>
						</c:choose>
		            </td>
		            <td>
		            	<c:choose>
						    <c:when test="${transaction.depositAmt le 0}">
								<!-- blank -->
						    </c:when>    
						    <c:otherwise>
									<fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${transaction.depositAmt}" />
						    </c:otherwise>
						</c:choose>
		            </td>
				</tr>
				</c:forEach>
			</table>
			</c:if>	
	    </div>
	    
		<!-- ADD TRANSACTION MODAL -->
		<div class="modal fade" id="addTxnModalCenter" tabindex="-1" role="dialog" aria-labelledby="addTxnModalCenterTitle" aria-hidden="true">
			<div class="modal-dialog modal-dialog-centered" role="document">
			  <div class="modal-content">
			    <div class="modal-header">
			      <h5 class="modal-title" id="addTxnModalLongTitle">Add Transaction</h5>
			      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
			        <span aria-hidden="true">&times;</span>
			      </button>
			    </div>
			    <form:form action="addtransaction" commandName="transaction">
			    <div class="modal-body">
					
						<div class="form-group">
							<label for="addTxnDate">DATE</label>
							<form:input cssClass="form-control" path="dateIssued" />
						</div>
						<div class="form-group">
							<label for="addTxnCheckNo">CHECK NUMBER</label>
							<form:input cssClass="form-control" path="checkNo" />
						</div>
						<div class="form-group">
							<label for="addTxnPayee">PAYEE</label>
							<form:select cssClass="form-control" path="payeeId">
								<form:option value="0" label="- Select -"/>
								<form:options items="${listPayee}" itemValue="id" itemLabel="description" />
							</form:select>
						</div>
						<div class="form-group">
							<label for="addTxnAccount">ACCOUNT</label>
							<form:select cssClass="form-control" path="accountId">
								<form:option value="0" label="- Select -"/>
								<form:options items="${listAccount}" itemValue="id" itemLabel="description" />
							</form:select>
						</div>
						<div class="form-group">
							<label for="addTxnWithdraw">WITHDRAWAL AMOUNT</label>
							<form:input cssClass="form-control" path="withdrawalAmt" />
						</div>
						<div class="form-group">
							<label for="addTxnDeposit">DEPOSIT AMOUNT</label>
							<form:input cssClass="form-control" path="depositAmt" />
						</div>
						<div class="form-check form-check-inline">
							<form:checkbox cssClass="form-check-input" path="recurFlag" />
							<label class="form-check-label" for="editTxnRec1">RECURRING</label>
						</div>
						<div class="form-check form-check-inline">
							<form:checkbox cssClass="form-check-input" path="inFlag" />
							<label class="form-check-label" for="editTxnIn1">IN</label>
						</div>
					
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
			        <button type="submit" class="btn btn-primary">Add</button>
			      </div>
			      </form:form>
			    </div>
			  </div>
		</div>	

    </div>
</body>
</html>