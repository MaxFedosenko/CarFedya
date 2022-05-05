<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<style>
       body {
        background: #FFFFFF;
        color: #006400;
       }
    </style>
</head>
<body>
<div class="position-absolute top-0 start-50 translate-middle-x">
    <div class="container">
        <div class="row">
                <div class="col">
                    <img src="/pictures/logo.png" width="200px" height="200px" class="position-relative top-0 start-50 translate-middle-x">
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <h2>Выберите Вашу роль</h2>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="position-absolute top-50 start-50 translate-middle-x">
    <div class="input-group mb-3">
        <a class="btn btn-success" href="/adminregistration" role="button">Регистрация админа</a>
    </div>
    <div class="input-group mb-3">
        <a class="btn btn-success" href="/clientregistration" role="button">Регистрация клиента</a>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>