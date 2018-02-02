<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: gavin
  Date: 2017/9/28
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GBK" language="java" session="false" %>
<html>
<head>
    <title>Async</title>
</head>
<body>

<h1>AAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBAA</h1>

<ul>

    <%
/*
       List<String> datas= (List<String>) pageContext.getAttribute("books");

       if (datas!=null){

           for (String data : datas) {

               out.println(data);
           }


       }*/


        if (request.isAsyncStarted()){

            request.getAsyncContext().complete();
        }


    %>

</ul>

</body>
</html>
