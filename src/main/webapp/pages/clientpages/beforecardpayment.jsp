<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="position-absolute top-0 start-50 translate-middle-x">
    <img src="/pictures/card.jpg" class="image-responsive-6">
</div>
<form action="/client/cardpayment" method="post">
<main>
<div style="background-color:White; font-size: 200%; width: 350px; height: 70px; position: relative; top: 60px; left: 660px;">
<h1><big>Форма оплаты</big></h1>
</div>
    <section>
        <input style="background-color:White; font-size: 200%; width: 600px; height: 70px; position: relative; top: 180px; left: 380px;" name="cc-number" inputmode="numeric" maxlength="19" placeholder="Номер карты (####-####-####-####)" pattern="[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}">
    </section>
    <section>
        <input style="background-color:White; font-size: 200%; width: 350px; height: 70px; position: relative; top: 250px; left: 380px;" name="cc-name" type="text" maxlength="50" placeholder="ИМЯ ВЛАДЕЛЬЦА" required>
    </section>
    <section id="cc-exp-csc">
    <div style="background-color:White; font-size: 150%; width: 128px; height: 38px; position: relative; top: 135px; left: 620px;">
            <select name="cc-exp-month" placeholder="MM">
                <option value="">MM</option>
                <option value="01">01</option>
                <option value="02">02</option>
                <option value="03">03</option>
                <option value="04">04</option>
                <option value="05">05</option>
                <option value="06">06</option>
                <option value="07">07</option>
                <option value="08">08</option>
                <option value="09">09</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
            </select>
            <select name="cc-exp-year" placeholder="YY">
                <option value="">YY</option>
                <option value="22">22</option>
                <option value="23">23</option>
                <option value="24">24</option>
                <option value="25">25</option>
                <option value="26">26</option>
                <option value="27">27</option>
                <option value="28">28</option>
                <option value="29">29</option>
                <option value="30">30</option>
            </select>
    </div>
    <div>
        <input style="background-color:White; width: 230px; height: 38px; position: relative; top: 100px; left: 760px;" name="cc-csc" type="password" maxlength="3" placeholder="Три цифры на обороте карты" required>
    </div>
    </section>
    <section style="background-color:White; font-size: 100%; width: 400px; height: 38px; position: relative; top: 200px; left: 620px;">
        <label for="cc-number">Сумма оплаты</label>
        <input name="cc-number" inputmode="numeric" maxlength="50" placeholder="Введите сумму" required>
    </section>
    <div style="background-color:White; font-size: 100%; width: 400px; height: 38px; position: relative; top: 200px; left: 620px;" class="input-group">
        <input type="submit" class="btn btn-success" style="width: 30%" value="Оплатить">
    </div>
    </form>
</main>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>