<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Temperature App</title>
    <link rel="stylesheet" href="/css/style2.css"/>
  </head>
<body>
  <div class="app-wrap">
    <header>
     	<form:form method="POST" action ="/find-date" modelAttribute="searchdate" >
		<div class="search">
			<div>
				<form:input type="text" id="search" name="search" path="searchdate"/>
			</div>
			<div>
				<input type="submit" value="Search"/>
			</div>
		</div>
		<div><form:errors path="searchdate" cssClass="error"/></div>
	</form:form>
    </header>
    <main>
     <section class="location">
     <div class="city">Istanbul,TR</div>
     <div class="date">${weather.weatherdate}</div>
    </section>
    <div class="temp">${weather.mintemp}<span>°c</span> / ${weather.maxtemp}<span>°c</span> </div>
    <div class="Weather">${weather.conditions}</div>
    <div class="hi-low">Rain chances : ${weather.rain}</div>
    <div class="city">Wind : ${weather.avgwind} -  Humidity : ${weather.avghumidity} -  Pressure : ${weather.avgpressure} </div>
    <div class="hi-low">SunRise : ${weather.sunrise} - SunSet : ${weather.sunset}</div>
    <div class="hi-low">MoonRise : ${weather.moonrise} - MoonSet : ${weather.moonset} </div>
    
  </div>
  <a href="/view-data"> View All Data</a>
    </main>
  </div>
  <script src="main.js"></script>
</body>
</html>