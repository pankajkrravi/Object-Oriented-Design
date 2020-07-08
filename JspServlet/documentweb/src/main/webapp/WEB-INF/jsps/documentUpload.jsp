<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Document Upload</title>
</head>
<body>
	<form action="/upload" method="post" enctype="multipart/form-data">
		id:<input type="text" name="id"> 
		Document:<input type="file"
			name="document"> 
			<input type="submit" name="submit"
			value="upload">
	</form>
</body>
</html>