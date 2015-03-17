<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Download</title>
</head>
<body>
<p>File Download</p>
<p>${requestScope.message}</p>

<form action="/download" method="post" enctype="multipart/form-data">

    <input type="submit" value="Download" />
</form>
</body>
</html>
