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
    <img src="/pictures/logo.png" width="200px" height="200px" class="image-responsive-6">
</div>
<div class="position-absolute top-50 start-50 translate-middle">
<form action="/admin/delete" method="post">
    <select name="id" class="form-select" aria-label="Default select example">
        <c:forEach items="${cars}" var="car">
            <option value="${car.getId()}">${car.getModel()}</option>
        </c:forEach>
    </select>
    <div class="input-group mb-3">
        <input type="submit" class="btn btn-success" style="width: 100%">
    </div>
</form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>