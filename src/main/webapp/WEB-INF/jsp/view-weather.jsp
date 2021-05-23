<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css">
<meta charset="UTF-8">
<title>Weather Application</title>
</head>
<body>
	<h2>Daily weather data</h2>
	
	<form:form method="POST" action ="/find-date" modelAttribute="searchdate" >
		<div><form:errors path="searchdate" cssClass="error"/></div>
		<form:input type="text" id="search" name="search" path="searchdate"/> 
		<input type="submit" value="Search"/>
	</form:form>
	
	<div id="container">

	<div id="card">
		<p>
			${weather.weatherdate}
		</p>
		
		<p>
			${weather.conditions}
		</p>
		
		<p>
			Rain chances : ${weather.rain}
		</p>
		
	</div>
	
	<div id="card">
		<p>
		MAX : ${weather.maxtemp}
		</p>
		<p>
		MIN : ${weather.mintemp}
		</p>
		<p>
		SunRise : ${weather.sunrise}
		</p>
		<p>
		SunSet : ${weather.sunset}
		</p>
		<p>
		MoonRise : ${weather.moonrise}
		</p>
		<p>
		MoonSet : ${weather.moonset}
		</p>
	
	</div>
	
		<div id="card">
			<p>
			Wind : ${weather.avgwind}
			</p>
			<p>
			Humidity : ${weather.avghumidity}
			</p>
			<p>
			 Pressure : ${weather.avgpressure}
			</p>
		
		</div>
	</div>
	
	
</body>
</html>