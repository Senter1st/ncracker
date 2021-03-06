<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
    <!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
    <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge"> -->
    <!--  <meta Content-type= "text/html"; charset=utf-8> -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <!-- <meta name="viewport" content="width=device-width, initial-scale=1">  -->
    <title>Anketa</title>

    <link rel="stylesheet" type="text/css" href="../resources/css/affablebean.css">
    <style>
        .select-tag{
            width: 800px;
        }
    </style>
    <!-- Bootstrap -->
    <link href="../resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="../resources/css/bootstrap-chosen.css" rel="stylesheet">

    <link href="../resources/css/select2.min.css" rel="stylesheet">

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="../resources/js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../resources/js/bootstrap.min.js"></script>
    <script src="../resources/js/chosen.jquery.js"></script>
    <script src="../resources/js/select2.min.js"></script>
    <script src="../resources/js/jquery.json.js"></script>
    <script src="../resources/js/anketa.js"></script>


    <link rel="stylesheet" href="../resources/css/styles.css">
    <link rel="stylesheet" href="../resources/css/userpagestyles.css">
    <script src="../resources/js/globalscript.js"></script>
    <script src="../resources/js/modalUserPhoto.js"></script>
    <script src="../resources/js/csrfscript.js"></script>
    <script src="../resources/js/menuModulescript.js"></script>

</head>
<body style="background-attachment:fixed" topmargin="10">

<jsp:include page="modules/navbarModule.jsp"/>

<jsp:include page="modules/modalPhotoModule.jsp"/>

<div class="container text-center">
    <div class="row">
        <div class="col-sm-4 well">
            <jsp:include page="modules/leftModule.jsp"/>
        </div>

        <div class="col-sm-8">
            <jsp:include page="modules/anketaModule.jsp"/>
        </div>
    </div>
</div>

</body>
</html>