<%@page language="java" pageEncoding="UTF-8" contentType="text/html" %>
<html>
<%@include file="../head.jspf"%>
<body>
<h2>Dodaj zadanie do wykonania</h2>
<form method="post">
    <label for="firstName">Imie</label><br>
    <input type="text" name="firstName" id="firstName"/><br>
    <label for="lastName">Nazwisko</label><br>
    <input type="text" name="lastName" id="lastName"><br>
    <label for="salary">Pensja</label><br>
    <input type="number" name="salary" id="salary"><br>
    <button type="submit">Zapisz</button><button type="reset">Wyczyść</button>
</form>
<li>
    <a href="/">Strona glowna</a>
</li>
</body>
</html>