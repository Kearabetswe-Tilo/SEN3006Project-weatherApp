<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css">
<meta charset="UTF-8">
<title>Weather|Data</title>
</head>
<body>
	<h2>Istanbul Weather Data 2009-2019</h2>
	<a href="/home">Return Home</a>
	<c:choose>
		<c:when test="${fn:length(data) > 0}">
		<table>
			<tr>
				<th>DateTime</th>
				<th>Condition</th>
				<th>Rain</th>
				<th>MaxMin</th>
				<th>MinTemp</th>
				<th>SunRise</th>
				<th>SunSet</th>
				<th>MoonRise</th>
				<th>MoonSet</th>
				<th>AvgWind</th>
				<th>AvgHumidity</th>
				<th>AvgPressure</th>
			</tr>
			<c:forEach items="${data}" var="i">
				<tr>
					<td>${i.weatherdate}</td>
					<td>${i.conditions}</td>
					<td>${i.rain}</td>
					<td>${i.maxtemp}</td>
					<td>${i.mintemp}</td>
					<td>${i.sunrise}</td>
					<td>${i.sunset}</td>
					<td>${i.moonrise}</td>
					<td>${i.moonset}</td>
					<td>${i.avgwind}</td>
					<td>${i.avghumidity}</td>
					<td>${i.avgpressure}</td>
				</tr>
			</c:forEach>
		</table>
		</c:when>
		<c:otherwise>
			<p class="small-italic">No weather data available.</p>
		</c:otherwise>
	</c:choose>
</body>
</html>