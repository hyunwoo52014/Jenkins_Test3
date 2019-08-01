<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html>
<html>
<body>
<h2>Test</h2>
<form method="post" action="result.jsp">
반복횟수&nbsp;:&nbsp;<input type="text" name="count">
숫자&nbsp;:&nbsp;<input type="text" name="number">
<input type="radio" name="chk_info" value="+">+
<input type="radio" name="chk_info" value="-">-
<input type="radio" name="chk_info" value="x">x
<input type="radio" name="chk_info" value="/">/
<input type="submit" value="실행"/>
</form>
</body>
</html>