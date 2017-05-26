<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Авторизация</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="../resources/css/styles.css">
    <script src="../resources/js/jquery-3.2.0.min.js"></script>
    <script src="../resources/js/bootstrap.min.js"></script>
    <script src="../resources/js/jquery-3.2.0.min.js"></script>
    <script src="../resources/js/customscript.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><img src="/resources/images/logo4.png"  height="30"></a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">

        </div>
    </div>
</nav>

<div class="container text-center">
    <div class="row">

        <div class="col-sm-6 col-sm-offset-3">
            <div class="panel well"
            <jsp:include page="modules/loginModule.jsp"/>
        </div>


    </div>
</div>
</div>

<jsp:include page="modules/footerModule.jsp"/>

</body>
</html>

