<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
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
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="3" aria-label="Slide 4"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="4" aria-label="Slide 5"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="5" aria-label="Slide 6"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="6" aria-label="Slide 7"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="7" aria-label="Slide 8"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="8" aria-label="Slide 9"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="9" aria-label="Slide 10"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="/cars/KiaRioX.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>${cars.get(0).getModel()}</h5>
        <p>${car.get(0).getRate()} BYN в минуту</p>
        <p>${car.get(0).getRate() + 0.1} BYN за километр</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="/cars/miniCooper.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>${cars.get(1).getModel()}</h5>
        <p>${car.get(1).getRate()} BYN в минуту</p>
        <p>${car.get(1).getRate() + 0.1} BYN за километр</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="/cars/tiguan.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>${cars.get(2).getModel()}</h5>
        <p>${car.get(2).getRate()} BYN в минуту</p>
        <p>${car.get(2).getRate() + 0.1} BYN за километр</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="/cars/fordMustang.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>${cars.get(3).getModel()}</h5>
        <p>${car.get(3).getRate()} BYN в минуту</p>
        <p>${car.get(3).getRate() + 0.1} BYN за километр</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="/cars/dodgeChallenger.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>${cars.get(4).getModel()}</h5>
        <p>${car.get(4).getRate()} BYN в минуту</p>
        <p>${car.get(4).getRate() + 0.1} BYN за километр</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="/cars/сhevroletCamaro.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>${cars.get(5).getModel()}</h5>
        <p>${car.get(5).getRate()} BYN в минуту</p>
        <p>${car.get(5).getRate() + 0.1} BYN за километр</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="/cars/teslaModel3.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>${cars.get(6).getModel()}</h5>
        <p>${car.get(6).getRate()} BYN в минуту</p>
        <p>${car.get(6).getRate() + 0.1} BYN за километр</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="/cars/TeslaModelX.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>${cars.get(7).getModel()}</h5>
        <p>${car.get(7).getRate()} BYN в минуту</p>
        <p>${car.get(7).getRate() + 0.1} BYN за километр</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="/cars/TeslaModelS.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>${cars.get(8).getModel()}</h5>
        <p>${car.get(8).getRate()} BYN в минуту</p>
        <p>${car.get(8).getRate() + 0.1} BYN за километр</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="/cars/MB.jpeg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>${cars.get(9).getModel()}</h5>
        <p>${car.get(9).getRate()} BYN в минуту</p>
        <p>${car.get(9).getRate() + 0.1} BYN за километр</p>
      </div>
    </div>
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