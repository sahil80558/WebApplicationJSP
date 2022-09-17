<%@page import="java.sql.*" %>
<%
    session=request.getSession();
    String s1=(String)session.getAttribute("SName");
    if(s1!=null){
        %>
<html>
    <head>
        <%@include file="css.jsp" %>
    </head>
    <body>
        <P class ="A">My Menu</p>
        <%@include file="mainmenu.jsp" %>
        <p class="U">&nbsp;&nbsp;&nbsp;Welcome&nbsp;&nbsp;<%=s1%></p>
        <center>
            <form action="delete.jsp">
                <table cellpadding="15px">
                    <tr>
                        <td>Enter Roll No.</td>
                        <td><input type="text" name="d1" placeholder="Enter Roll. No."</td>
                        <td><input type="submit" name="b1" value="Delete" class="B"</td>
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

String s2=request.getParameter("b1");
if(s2!=null){
try{
        String s3=request.getParameter("d1");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/web?useSSL=false&allowPublicRetrieval=true","root","S@hil8055");
        Statement st=con.createStatement();
        String q="delete from insmarks where ROLLNO='"+s3+"'";
        st.executeUpdate(q);
        response.sendRedirect("show.jsp?s1=Data Deleted");
        con.close();
}
catch(Exception e){
       out.print(e);
}

}
    %>