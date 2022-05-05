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
<div id="carouselExampleCaptions" class="carousel slide" data-bs-interval="false">
  <div class="carousel-indicators">
      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
      <c:forEach var="i" begin="1" end="${counter}" step="1" varStatus ="status">
          <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="${i}" aria-label="Slide ${i+1}"></button>
      </c:forEach>
    </div>
    <div class="carousel-inner">
      <c:forEach items="${cars}" var="car" varStatus="status">
      <c:choose>
        <c:when test="${status.first}">
          <div class="carousel-item active">
                <img src="/cars/${car.getModel()}.jpg"  height="665" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                  <h5>${car.getModel()}</h5>
                  <p>${car.getDescription()}</p>
                </div>
              </div>
        </c:when>
        <c:otherwise>
          <div class="carousel-item">
                    <img src="/cars/${car.getModel()}.jpg"  height="665" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                      <h5>${car.getModel()}</h5>
                      <p>${car.getDescription()}</p>
                    </div>
                  </div>
        </c:otherwise>
      </c:choose>
      </c:forEach>
    </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>