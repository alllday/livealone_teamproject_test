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
게시물 상세 페이지 <br>
게시글번호 : ${bag.no} <br>
게시글 작성자 : ${bag.writer} <br>

<c:set var="writer" value="${bag.writer}"/>
현재세션 : <c:out value="${id}"/> <br>
게시글 작성자 : <c:out value="${writer}"/> <br>

<c:choose>
 <c:when test = "${writer eq id}">
 	<form action="chatList" method="get">
		<button type="submit">채팅 목록</button>
	</form>
 </c:when>
 
 <c:otherwise>
 	<form action="charRoom" method="get">
		<button type="submit">채팅 요청</button>
	</form>
 </c:otherwise>
</c:choose>
</body>
</html>