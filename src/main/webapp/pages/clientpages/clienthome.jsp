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
<nav class="navbar navbar-light bg-light sticky-top">
  <div class="container-fluid">
    <a class="navbar-brand" href="/client">
    <img class="img-responsive" src="logo.png">
    CarFedya</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
      <div class="offcanvas-header">
        <h5 class="offcanvas-title" id="offcanvasNavbarLabel">Меню сайта</h5>
        <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas" aria-label="Close"></button>
      </div>
      <div class="offcanvas-body">
        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/client">Главная</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="/client" id="offcanvasNavbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Навигация сайта
            </a>
            <ul class="dropdown-menu" aria-labelledby="offcanvasNavbarDropdown">
              <li><a class="dropdown-item" href="/client/cars">Автомобили</a></li>
              <li><a class="dropdown-item" href="/client/beforebooking">Забронировать автомобиль</a></li>
              <li><a class="dropdown-item" href="/client/rate">Цены</a></li>
              <li><a class="dropdown-item" href="/client/beforecardpayment">Оплата</a></li>
              <li><a class="dropdown-item" href="/client/beforecalculate">Расчет стоимости</a></li>
              <li><a class="dropdown-item" href="/client/support">Подсказки</a></li>
              <li><a class="dropdown-item" href="/client/contacts">Контакты</a></li>
            </ul>
          </li>
        </ul>
      </div>
    </div>
  </div>
</nav>
<div class="container">
    <div class="row">
        <div class="col-sm">
            <img src="/pictures/logo.png" width="300px" height="300px" class="image-responsive-6">
        </div>
        <div class="col-sm">
            <h2>Регистрация в течение 30 минут</h2>
            <p>нужен паспорт, водительское удостоверение категории B и банковская карта</p>
            <h2>Бензин оплачиваем мы</h2>
            <p>заправляйся за наш счет по топливной карте, которая лежит в бардачке</p>
            <h2>Круглосуточная онлайн поддержка</h2>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>