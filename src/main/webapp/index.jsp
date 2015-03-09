<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
<p>${requestScope.error}</p>

<form action="/login" method="post">
    <label>Username:</label>
    <input type="text" name="user">
    <label>Password:</label>
    <input type="password" name="password">
    <input type="submit" value="Login">
</form>

<a href="/upload">File Upload</a>

</body>
</html>
