<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>member::list</title>
	</head>
<body>
	<h3>member 목록</h3>
	<a href="/Ch05">Ch05 메인</a>
	<a href="/Ch05/member/register">member 등록</a>
	
	<table border="1">
		<tr>
			<td>irum</td>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>나이</td>
			<td>주소</td>
			<td>번호</td>
			<td>관리</td>
		</tr>
		<c:forEach var="member" items="${members}">
			<tr>
				<td>${member.irum}</td>
				<td>${member.id}</td>
				<td>${member.pw}</td>
				<td>${member.age}</td>
				<td>${member.addr}</td>
				<td>${member.tel}</td>
				
				<td>
					<a href="/Ch05/member/modify?id=${member.id}">수정</a>
					<a href="/Ch05/member/delete?id=${member.id}">삭제</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>