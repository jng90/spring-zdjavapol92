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
            <th>Termin wykonania</th>
            <th>Zrealizowane</th>
            <th>Data utworzenia</th>
        </tr>
        </thead>
        <tbody>
        <jsp:useBean id="todos" scope="request" type="java.util.List<pl.sda.springzdjavapol92.model.Todo>"/>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>
                    ${todo.title}
                </td>
                <td>
                    ${todo.person}
                </td>
                <td>
                    ${todo.deadline}
                </td>
                <td>
                    <form action="/todo/completed" method="post">
                        <input type="hidden" name="id" value="${todo.id}">
                    <c:if test="${todo.completed}">
                        <input type="checkbox"checked disabled>
                    </c:if>
                    <c:if test="${!todo.completed}">
                    <input type="checkbox" name="completed">
                    </c:if>
                        <button type="submit">Zapisz wykonanie</button>
                    </form>
                </td>
                <td>
                    ${todo.created}
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