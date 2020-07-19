<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="pl.kk.model.Warehouse" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Produkty</h1>
<c:set var="warehouse" scope="application" value="${Warehouse.productsWarehouse}"/>
<table border="1">
    <tr>
        <td>Nazwa produktu</td>
        <td>Producent</td>
        <td>Specyfikacja</td>
        <td>Ilość</td>
    </tr>
    <c:forEach var="product" items="${warehouse}">
        <tr>
            <td><c:out value="${product.key.productName}"/></td>
            <td><c:out value="${product.key.manufacturer}"/></td>
            <td><c:out value="${product.key.specification}"/></td>
            <c:if test="${product.value != null}">
            <td><c:out value="${product.value}"/></td>
            </c:if>
            <c:choose>
                <c:when test="${product.value > 0}">
                    <td>
                        <form action="${pageContext.request.contextPath}/buy">
                            <input type="hidden" name="product" value="${product.key.productName}">
                            <input type="submit" value="Kup Teraz!">
                        </form>
                    </td>
                </c:when>
                <c:when test="${product.value == 0}">
                    <td>
                        <input type="submit" value="Kup Teraz!" disabled>
                    </td>
                </c:when>
            </c:choose>

        </tr>
    </c:forEach>
</table>

</body>
</html>
