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
<form method="post" action="/authorization">
    <div class="form-floating mb-3">
        <input type="text" name="login" class="form-control" id="floatingInput" style="width: 100%" placeholder="Login" required>
        <label for="floatingInput">Логин</label>
    </div>
    <div class="form-floating mb-3">
        <input type="password" name="password" class="form-control" id="floatingPassword" style="width: 100%" placeholder="Password" required>
        <label for="floatingPassword">Пароль</label>
    </div>
    <div class="input-group mb-3">
        <input type="submit" class="btn btn-success" style="width: 100%">
    </div>
</form>
<div style="position: relative; top: 320px; left: 550px;">
    <a class="btn btn-success" href="/beforeclientregistration" role="button">Зарегистрироваться</a>
</div>
</div>
<div style="position: relative; top: 420px; left: 570px;">
<p style="color:Tomato;">${exc}</p>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>