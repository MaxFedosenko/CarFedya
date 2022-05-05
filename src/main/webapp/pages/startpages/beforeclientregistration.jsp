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
    <div class="container">
        <div class="row">
            <div class="col">
                <img src="/pictures/logo.png" width="200px" height="200px" class="position-relative top-0 start-50 translate-middle-x">
            </div>
        </div>
        <div class="row">
            <div class="col">
                <form method="post" action="/clientregistration">
                    <div class="form-floating">
                        <input type="text" name="name" class="form-control" id="floatingInput" style="width: 100%" placeholder="Name">
                        <label for="floatingInput">Имя пользователя</label>
                    </div>
                    <div class="form-floating">
                        <input type="text" name="login" class="form-control" id="floatingInput" style="width: 100%" placeholder="Login" required>
                        <label for="floatingInput">Логин</label>
                    </div>
                    <div class="form-floating">
                        <input type="password" name="password" class="form-control" id="floatingPassword" style="width: 100%" placeholder="Password" required>
                        <label for="floatingPassword">Пароль</label>
                    </div>
                    <div class="form-floating">
                        <input type="text" name="numberPhone" class="form-control" id="floatingInput" style="width: 100%" placeholder="numberPhone" required>
                        <label for="floatingInput">Номер телефона</label>
                    </div>
                    <div class="form-floating">
                        <input type="text" name="email" class="form-control" id="floatingInput" style="width: 100%" placeholder="userName@example.com" required>
                        <label for="floatingInput">Почта</label>
                    </div>
                    <select name="role" class="form-select" aria-label="Default select example">
                      <option selected value="noRole">Выберите роль</option>
                      <option value="admin">Администратор</option>
                      <option value="client">Клиент</option>
                    </select>
                    <div class="input-group">
                        <input type="submit" class="btn btn-success" style="width: 110%">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<div style="position: relative; top: 590px; left: 600px;">
    <p style="color:Tomato;">${exc}</p>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>