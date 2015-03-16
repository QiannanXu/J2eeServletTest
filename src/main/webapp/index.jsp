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

<p><a href="/upload">File Upload</a></p>

<p><a href="/download">File Download</a></p>

<p><a href="/parameters">More Parameters</a></p>

<p><a href="/ajax">Ajax Test</a></p>

<form action="/threadSecurity" method="get">
    <input type="text" name="message" value="HelloA" />
    <input type="submit" value="submit" />
</form>

<form action="/threadSecurity" method="get">
    <input type="text" name="message" value="HelloB" />
    <input type="submit" value="submit" />
</form>


</body>
</html>
