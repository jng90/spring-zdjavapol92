<jsp:useBean id="person" scope="request" type="pl.sda.springzdjavapol92.model.Person"/>
<%@page contentType="text/html" language="java" pageEncoding="UTF-8" %>
<html>
<body>
<h1> Ok, dodałeś nowa osobe</h1>
<p>Imie: ${person.firstName}</p>
<p>Nazwisko: ${person.lastName}</p>
<p>Pensja: ${person.salary}</p>
<a href="${pageContext.request.contextPath}/person">Person</a>
<a href="${pageContext.request.contextPath}/person/add">Dodaj następna osobe</a>
<li>
    <a href="/">Strona glowna</a>
</li>
</body>
</html>