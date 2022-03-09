<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>

<head>
  <title>Demo</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<div class = "col-md-12">
<div  class="box box-default" style="min-height: 517px;border:1px solid #E5E8ED;background-color: #FFFFFF;margin-bottom:10px; width:100%">
   <div class="box-heading">
      <h3 class="box-title" style="text-align: center">Transaction Status</h3>
      <div style="margin:10px;border-bottom:1px solid #CACACA"></div>
      <br>
      <div id="successPage" style="display:none;">
      <!--    <div style="text-align: center;">
            <img  src="images/success.png" >
         </div> -->
         <div id = "status" style="display: none;">
            <h2 style="font-weight: bold;color:#00FF00	;text-align: center;"><small  style="font-weight: bold;font-size: inherit;color:#228B22;"> Transaction Successful </small></h2>
         </div>
          <div id = "status1"style="display: none;" >
            <h2 style="font-weight: bold;color:#00FF00;text-align: center;"><small  style="font-weight: bold;font-size: inherit;color:#FF0000;"> Transaction Failed
             </small></h2>
         </div>
         <br>
         <br>
         <div class="box-body">
            <div class="row" style="margin:5px;padding:5px;border-bottom: 1px solid #CACACA">
               <div class="col-md-3">TxnReferenceNo:</div>
               <div class="col-md-9">${txnReferenceNo}</div>
            </div>
            <div class="row" style="margin:5px;padding:5px;border-bottom: 1px solid #CACACA">
               <div class="col-md-3">BankReferenceNo:</div>
               <div class="col-md-9">${bankReferenceNo}</div>
            </div>
            <div class="row" style="margin:5px;padding:5px;border-bottom: 1px solid #CACACA">
               <div class="col-md-3">Transaction Amount:</div>
               <div class="col-md-9">  ${amount}</div>
            </div>
            <div class="row" style="margin:5px;padding:5px;border-bottom: 1px solid #CACACA">
               <div class="col-md-3">Transaction Date & time:</div>
               <div class="col-md-9"><span id="datetime"></span></div>
            </div>
            <div class="row" style="margin:5px;padding:5px;border-bottom: 1px solid #CACACA">
               <div class="col-md-3">Order Id :</div>
               <div class="col-md-9">${orderid}</div>
            </div>
         </div>
      </div>
   </div>
</div>
</div>

<script>
$(document).ready(function(){
	document.getElementById("datetime").innerHTML = Date();			
		$('#successPage').show();	
		
		if('${status}' == 'Success'){
			$("#status").css("display", "block");
		}else{
			$("#status1").css("display", "block");
		}
});
</script>
</html>
