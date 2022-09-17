<%@page import="java.sql.*" %>
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
<center>
    <%String s2=request.getParameter("s1");
    if(s2!=null){%>
     <%=s2%>
    <%}%>
<table cellpadding="15px" border="8px">
    <tr bgcolor="red">
        <td>Roll No.</td>
        <td>Name</td>
        <td>Core Java</td>
        <td>Advance Java</td>
        <td>Core DS</td>
    </tr>
    <%
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/web?useSSL=false&allowPublicKeyRetrieval=true","root","S@hil8055");
            Statement st=con.createStatement();
            String q="select *from insmarks";
            ResultSet rs=st.executeQuery(q);
            while(rs.next()){
                %>
          <tr>
              <td><%=rs.getString(1)%></td>
              <td><%=rs.getString(2)%></td>
              <td><%=rs.getString(3)%></td>
              <td><%=rs.getString(4)%></td>
              <td><%=rs.getString(5)%></td>
          </tr>
    <%
            }
        }catch(Exception e){
            out.println(e);
        }
    %>
</table>
<center>
</body>
</html>
 <%   
}else{
response.sendRedirect("login.jsp");
}
%>
