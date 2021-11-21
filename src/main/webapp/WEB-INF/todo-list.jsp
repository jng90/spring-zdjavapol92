<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" pageEncoding="UTF-8" contentType="text/html" %>
<html>
<body>
<h2>Lista zadan</h2>
    <table>
        <thead>
        <tr>
            <th>Tresc Zadania</th>
            <th>Osoba odpowiedzialna</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>
                    ${todo.title}
                </td>
                <td>
                    ${todo.person}
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
<li>
    <a href="/">Strona glowna</a>
</li>
</body>
</html>