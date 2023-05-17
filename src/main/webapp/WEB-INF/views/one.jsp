<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
게시판 리스트! <br>
${bag.no} <br>
${bag.writer} <br>

<form action="chat" method="get">
	<button type="submit">채팅 요청</button>
</form>
</body>
</html>