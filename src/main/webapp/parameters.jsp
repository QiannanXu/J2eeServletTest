<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Parameters</title>
</head>
<body>

    <form action="/parameters" method="post" id="form">
        <label>书名：</label>
        <input type="text" name="bookName" />
        <label>价格：</label>
        <input type="text" name="bookPrice" />
        <input type="submit" name="submit" value="Submit" />
    </form>

    <form>
        <label>书名：</label>
        <label>${requestScope.bookName}</label>
        <label>价格：</label>
        <label>${requestScope.bookPrice}</label>
    </form>

</body>
</html>
