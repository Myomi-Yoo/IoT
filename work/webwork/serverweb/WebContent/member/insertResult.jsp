<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>forward�� �̿��� ����ȭ��и�</h1>
	<hr/><hr/><hr/><hr/><hr/>
	<%	
		//������ ������ ������ ������
		int result = (int)request.getAttribute("membData");
	%>
	<h2><%= result %>���� ���Լ���!!</h2>
</body>
</html>