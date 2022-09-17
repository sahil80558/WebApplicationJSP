<%
session=request.getSession();
String s1=(String)session.getAttribute("SName");
if(s1!=null){%>
    <html>
    <head>
        <%@include file="css.jsp" %>
</head>
<body>
<P class ="A">My Menu</p>
    <%@include file="mainmenu.jsp" %>
<p class="U">&nbsp;&nbsp;&nbsp;Welcome&nbsp;&nbsp;<%=s1%></p>
</body>
</html>
 <%   
}else{
response.sendRedirect("login.jsp");
}
%>
