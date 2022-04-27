<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<form action="/finalclientregistration" method="post">
    <input name="name" type="text" placeholder="name" required> <br>
    <input name="login" type="text" placeholder="login" required> <br>
    <input name="password" type="password" placeholder="password" required> <br>
    <input name="numberPhone" type="text" placeholder="numberPhone" required> <br>
    <input name="email" type="text" placeholder="userName@example.com" required> <br>
    <input type="submit"> <br>
</form>
${startError}
${clientError}

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>