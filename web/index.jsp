<%--
  User: ming
  Date: 2018/3/12
  Time: 17:37
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/user_add" method="post">
    username : <input type="text" name="username" ><br>
    password :<input type="password" name="password" >
    <input type="submit" value="注册">
  </form>
  </body>
</html>
