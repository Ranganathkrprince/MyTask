
<html>
<head>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
<script type="text/javascript">
window.setTimeout(function(){
	$("form").submit();
}, 1); 
</script> 
<body >
 <form name="myForm" action = "${action}"   method="post">
<input type="hidden" name="firstname" value="${firstname}" />
<input type="hidden" name="lastname" value="${lastname}" />
<input type="hidden" name="surl" value="${surl}" />
<input type="hidden" name="phone" value="${phone}" />
<input type="hidden" name="key" value="${key}" />
<input type="hidden" name="hash" value ="${hash}" />
<input type="hidden" name="curl" value="${curl}" />
<input type="hidden" name="furl" value="${furl}" />
<input type="hidden" name="txnid" value="${txnid}" />
<input type="hidden" name="productinfo" value="${productinfo}" />
<input type="hidden" name="amount" value="${amount}" />
<input type="hidden" name="email" value="${email}" /> 

<input type="hidden" name="udf1" value="${udf1}" /> 
<input type="hidden" name="udf2" value="${udf2}" /> 
<input type="hidden" name="udf3" value="${udf3}" /> 
<input type="hidden" name="udf4" value="${udf4}" /> 
<input type="hidden" name="udf5" value="${udf5}" /> 
</form>    
</body>

</html>