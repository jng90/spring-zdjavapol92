<%@page language="java" pageEncoding="UTF-8" contentType="text/html" %>
<html>
<%@include file="head.jspf"%>
<body>
<%@include file="nav.jspf"%>
    <h2>Dodaj zadanie do wykonania</h2>
    <form method="post">
        <label for="title">Tytuł zadania</label><br>
        <input type="text" name="title" id="title"/><br>
        <label for="deadline">Termin wykonania</label><br>
        <input type="date" name="deadline" id="deadline"><br>
        <label for="person">Osoba odpowiedzialna</label><br>
        <input type="text" name="person" id="person"><br>
        <button type="submit">Zapisz</button><button type="reset">Wyczyść</button>
    </form>
</body>
</html>