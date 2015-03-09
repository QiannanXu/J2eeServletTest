<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Upload</title>
</head>
<body>

<p>${requestScope.uploadMessage}</p>

<form action="/upload" method="post" enctype="multipart/form-data">
    <label>File:</label>
    <input type="file" name="file" id="file" />
    <label>Destination:</label>
    <input type="text" value="/Users/qnxu/Projects/WorkShop/J2eeServletTest/src/main/resources" name="destination" />

    <input type="submit" value="Upload" name="upload" id="upload" />
</form>

</body>
</html>
