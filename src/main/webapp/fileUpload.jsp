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

    <input type="submit" value="Upload" />
</form>

</body>
</html>
