<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="position-absolute top-0 start-50 translate-middle-x">
    <img src="/pictures/logo.png" width="200px" height="200px" class="image-responsive-6">
</div>
<div class="position-absolute top-50 start-50 translate-middle">
<p style="color:Black;">Информация о машине была успешно обновлена!</p>
<a class="btn btn-success" href="/admin/beforeupdate" role="button">Редактировать еще одну машину</a><br>
<a class="btn btn-success" href="/admin/carsoperation" role="button">Перейти к выбору действия с машиной</a>
</div>
<a class="btn btn-success" href="/admin" role="button">Перейти на главную</a>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>