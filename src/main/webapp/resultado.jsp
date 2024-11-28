<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Estudiante
  Date: 28/11/2024
  Time: 8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultado de Numeros Primos</title>
</head>
<body>
<h1>Resultado</h1>
<p><strong>Numeros primos encontrados:</strong></p>
<ul>

    <!--lista de numeros primos usando-->

    <c:forEach var="primo" items="${primos}">
        <li>${primo}</li>
    </c:forEach>
</ul>

<!-- muestra el total de numeros primos encontrados -->

<p><strong>Total de numeros primos:</strong> ${cantidad}</p>
<a href="index.html">Volver al Inicio</a>
</body>
</html>











