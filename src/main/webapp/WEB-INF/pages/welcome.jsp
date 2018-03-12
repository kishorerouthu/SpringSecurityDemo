<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<%@ page isELIgnored="false" %>
</head>

<body>
    <h2>Successfully loggedin by ${username}</h2>
   <form action="logout" method="post">
     <input type="submit" value="Logout">
   </form>
</body>
</html>