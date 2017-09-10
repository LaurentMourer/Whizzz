<%--
  Created by IntelliJ IDEA.
  User: laurentmourer
  Date: 06/09/2017
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach items="${ Bonlivraison }" var="titre">
    <tr>
        <td>
            <c:out value="${titre.numjira}"/>
        </td>
    </tr>
    </c:forEach>
    <table>
</body>
</html>
