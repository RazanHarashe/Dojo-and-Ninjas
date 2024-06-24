<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>New Dojo</title>
</head>
<body>
<h1>New Dojo</h1>
<form action="#" th:action="@{/dojos/new}" th:object="${dojo}" method="post">
    <p>Name: <input type="text" th:field="*{name}" /></p>
    <p><input type="submit" value="Create" /></p>
</form>
</body>
</html>
