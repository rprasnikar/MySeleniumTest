<%-- 
    Document   : simpleform.jsp
    Created on : 08.05.2014, 11:42:23
    Author     : Robert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>JSP DEMO</title>
 </head>
 <body>
 <h1>Sample entries:</h1>
 <%-- Call another JSP file on submit--%>
 <form action="simpleresult.jsp">
 Name: <input type="text" name="yourName" value="" /><BR>
 Age: <input type="text" name="yourAge" value="" /><BR>
 <input id="s" type="submit" value="Send" />
 </form>
 <a name="link" href="./index.html">home</a>
 </body>
</html>
