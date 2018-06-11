<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello File Server!  
</h1>
	<form enctype="/FileUpload/form-data">
		<input type="file" name="file" id="file" multiple="multiple"><br>
		<input type="submit" value="파일업로드">
	</form>
	<div id="view"></div>
</body>
</html>
