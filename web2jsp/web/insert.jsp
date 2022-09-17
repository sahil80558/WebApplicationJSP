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
<%
String s2=request.getParameter("s1");
if(s2!=null){
    %><p align="center"><%=s2%></p>
<%}%>
<center>
    <form action="insert1.jsp">
        <table cellpadding="18px">
            <tr>
<td>Enter Roll.No.</td>
<td><input type ="text" placeholder ="Enter Roll.No." name="u1" required></td>
</tr>
<tr>
<td> Enter Name</td>
<td><input  type ="text" placeholder ="Enter Name" name="u2" required></td>
</tr>
</tr>
<tr>
<td>Core Java</td>
<td><input  type ="text" placeholder ="Core Java" name="u3" required></td>
</tr>
<tr>
<tr>
<td>Advance Java</td>
<td><input  type ="text" placeholder ="Advance Java" name="u4" required></td>
</tr>
<tr>
<td>Core DS</td>
<td><input  type ="text" placeholder ="Core DS" name="u5" required></td>
</tr>
<tr>
<td align="center" colspan="2"><input class ="B" type="submit" value="Insert"></td>
</tr>
        </table>
    </form>
</center>
</body>
</html>
 <%   
}else{
response.sendRedirect("login.jsp");
}
%>
