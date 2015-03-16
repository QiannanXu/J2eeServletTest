<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Parameters</title>
</head>
<body>

    <%--<form action="/parameters" method="post" id="form">--%>
        <%--<label>书名：</label>--%>
        <%--<input type="text" name="bookName" />--%>
        <%--<label>价格：</label>--%>
        <%--<input type="text" name="bookPrice" />--%>
        <%--<input type="submit" name="submit" value="Submit" />--%>
    <%--</form>--%>

    <form action="/parameters" method="post" id="form">
        <label>书名：</label>
        <input type="text" name="bookName" />
        <label>类型：</label>
        <label><input type="checkbox" name="bookType" value="小说"/>小说</label>
        <label><input type="checkbox" name="bookType" value="散文"/>散文</label>
        <label><input type="checkbox" name="bookType" value="诗歌"/>诗歌</label>

        <label>国家：</label>
        <select multiple="multiple" size="3" name="country">
            <option value="中国">中国</option>
            <option value="韩国">韩国</option>
            <option value="英国">英国</option>
        </select>
        <input type="submit" name="submit" value="Submit" />
    </form>

    <form>
        <label>书名：</label>
        <label>${requestScope.bookName}</label>
        <label>类型：</label>
        <label>${requestScope.bookType}</label>
        <label>国家：</label>
        <label>${requestScope.country}</label>
    </form>

</body>
</html>
