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
<form action="/client/finalcardpayment" method="post">
<main>
<h1>Форма оплаты</h1>
    <section>
        <label for="cc-number">Номер карты</label>
        <input name="cc-number" inputmode="numeric" maxlength="50" placeholder="**** **** **** ****" required>
    </section>
    <section>
        <label for="cc-name">Имя владельца</label>
        <input name="cc-name" type="text" maxlength="50" placeholder="ИМЯ ВЛАДЕЛЬЦА" required>
    </section>
    <section id="cc-exp-csc">
    <div>
        <label for="cc-exp">Срок действия карты</label>
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
        <label for="cc-csc">Код безопасности</label>
        <input name="cc-csc" type="password" maxlength="3" placeholder="Три цифры на обороте карты" required>
    </div>
    </section>
    <section>
        <label for="cc-number">Сумма оплаты</label>
        <input name="cc-number" inputmode="numeric" maxlength="50" placeholder="Введите сумму" required>
    </section>
    <button>Оплатить</button>
    </form>
</main>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>