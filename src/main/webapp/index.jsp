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

<p>File upload</p>
<form action="/upload" method="post" enctype="multipart/form-data">
    <label>File:</label>
    <input type="file" name="file" id="file" />
    <label>Destination:</label>
    <input type="text" value="/Users/qnxu/Projects/WorkShop/J2eeServletTest/src/main/resources" name="destination" />

    <input type="submit" value="Upload" name="upload" id="upload" />
</form>

</body>
</html>
