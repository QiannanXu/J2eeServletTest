<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Download</title>
</head>
<body>
<p>File Download</p>
<p>${requestScope.message}</p>

<form action="/download" method="post" enctype="multipart/form-data">
    <label>File:</label>
    <input type="file" name="file" id="file" />
    <label>Destination:</label>
    <input type="text" value="/Users/qnxu/Projects/WorkShop/J2eeServletTest/src/main/resources" name="destination" />

    <input type="submit" value="Download" name="Download" id="Download" />
</form>
</body>
</html>
