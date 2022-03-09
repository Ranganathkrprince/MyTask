<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
  <title>Demo</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <style type="text/css">


body { margin-top:20px; }
.panel-title {display: inline;font-weight: bold;}
.checkbox.pull-right { margin: 0; }
.pl-ziro { padding-left: 0px; }
  .fa {  
    font-size: xx-large;
}
.divcenter {
    position: ab;
    position: absolute;
    top: 35px;
    bottom: 0;
    left: 0;
    right: 0;
    margin: auto;
}
.btn-group-lg>.btn, .btn-lg {
    padding: 7px 20px;
}
  </style>
</head>
<body>

<div class="container">

    <div class="col-xs-12 col-md-6 divcenter">
  <form class="form-horizontal" action="${action}" method="POST">
   <div class="panel panel-default">
   
   <div class="panel-heading">
                    <h3 class="panel-title">
                        Payment Details
                    </h3>
                    <div class="checkbox pull-right">
                        <label>
                            <input type="checkbox" />
                            Remember
                        </label>
                    </div>
      </div>
      
                    <div class="panel-body">
                    <form role="form">
                    <div class="form-group">
                     <div class="icon-container">
					  <i class="fa fa-cc-visa fa-10x" style="color:navy;"></i>
					  <i class="fa fa-cc-amex" style="color:blue;"></i>
					  <i class="fa fa-cc-mastercard" style="color:red;"></i>
					  <i class="fa fa-cc-discover" style="color:orange;"></i>
					</div>
                        <div class="input-group">
                            <input type="text" class="form-control" id="cardNumber" placeholder="Valid Card Number"
                                 autofocus />
                            <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xs-7 col-md-7">
                            <div class="form-group">
                                <label for="expityMonth" >
                                    EXPIRY DATE</label>
                                <div class="col-xs-6 col-lg-6 pl-ziro" style="margin-top: 25px;">
                                    <input type="text" class="form-control" id="expityMonth" placeholder="MM"  />
                                </div>
                                <div class="col-xs-6 col-lg-6 pl-ziro">
                                    <input type="text" class="form-control" id="expityYear" placeholder="YY"  /></div>
                            </div>
                        </div>
                        <div class="col-xs-5 col-md-5 pull-right">
                            <div class="form-group">
                                <label for="cvCode">
                                    CV CODE</label>
                                <input type="password" class="form-control" id="cvCode" placeholder="CV"  />
                            </div>
                        </div>
                    </div>
                    </form>
                </div>  
      
              <ul class="nav nav-pills nav-stacked">
                <li class="active"><a href="#"><span class="badge pull-right"><span class="fa fa-inr" style="font-size: large;"></span>${amt}</span> Final Payment</a>
                </li>
            </ul>
    <!-- <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <div class="checkbox">
          <label><input type="radio" value = "Success" name="status" checked> Success</label>
		  <label><input type="radio"value = "Failed" name="status"> Failure </label>
        </div>
		
      </div>	  
    </div> -->
    <div class="form-group" style="margin-top: 15px;">        
      <div class="col-sm-offset-2 col-sm-10">
      <input type="hidden" name="amt" value ="${amt}">
      <input type="hidden" name="mer_txn" value ="${mer_txn}">
      <input type="hidden" name="mmp_txn" value ="${mmp_txn}">
      <input type="hidden" name="bank_txn" value ="${bank_txn}">
      <button type="submit" class="btn btn-default btn-lg btn-block" name="f_code" value = "Failed" style="width: 30%;float: left;">cancel</button>
       <button type="submit" class="btn btn-success btn-lg btn-block" name="f_code"  value = "Success"  style="width: 30%;margin-top: 0px;">Submit</button>
      </div>
    </div>
    </div>
  </form>
  </div>
</div>

</body>
</html>
