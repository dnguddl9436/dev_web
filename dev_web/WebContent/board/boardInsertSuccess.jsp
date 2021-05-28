<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.Map"  %>
<%	List<Map<String,Object>> zipCodeList = (List<Map<String,Object>>)request.getAttribute("zipCodeList"); %>
<%	out.println(zipCodeList); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록 성공 페이지</title>
</head>
<body>
등록 성공 페이지 입니다.
</body>
</html>