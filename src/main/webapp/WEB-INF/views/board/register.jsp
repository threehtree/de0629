
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>register</h2>
    <link rel="icon" type="image/ico" href="${pageContext.request.contextPath}/resources/static/images/favicon.ico">
        <form action="/board/register" method="post">
            <input type="text" name="title">
            <input type="text" name="content">
            <input type="text" name="writer">
            <button>Click</button>
        </form>
</body>
</html>
