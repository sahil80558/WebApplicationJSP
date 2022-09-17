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
    <form action="search.jsp">
<table cellpadding="14px">
    <tr>
        <td>Enter Roll No.</td>
        <td><input type="text" placeholder="Enter RollNo."name="t1"></td>
        <td><input type="submit" name="b1" value="Search" class="B"></td>
    </tr>
</table>
    </form>
     <form action="search.jsp">
        <table cellpadding="15px">
        <%
        String s2=request.getParameter("b1");
        if(s2!=null){
            String s0=request.getParameter("t1");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/web?useSSL=false&allowPublicKeyRetrieval=true","root","S@hil8055");
            Statement st=con.createStatement();
            String q="select *from insmarks where ROLLNO='"+s0+"'";
            ResultSet rs=st.executeQuery(q);
            while(rs.next()){
            %>    
             <tr>
                <td>Roll No.</td>
                <td><input type="text" value="<%=rs.getString(1)%>"  name="t1"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" value="<%=rs.getString(2)%>"  name="t2"></td>
            </tr>
            <tr>
                <td>Core Java</td>
                <td><input type="text" value="<%=rs.getString(3)%>"  name="t3"></td>
            </tr>
            <tr>
                <td>Advance Java</td>
                <td><input type="text" value="<%=rs.getString(4)%>"  name="t4"></td>
            </tr>
            <tr>
                <td>Core DS</td>
                <td><input type="text" value="<%=rs.getString(5)%>" name="t5"></td>
            </tr>
            <tr>           
            <td colspan="2" align="center"><input type="submit" value="Update" name="b2" class="B"></td>
            </tr>
        </table>
    </form>
    </center>
</body>
</html>
    <%}
        }catch(Exception e){
          out.println(e);   
        }
        }
            String s=request.getParameter("b2");
             if(s!=null){
        String s3=request.getParameter("t1");
        String s4=request.getParameter("t2");
        String s5=request.getParameter("t3");
        String s6=request.getParameter("t4");
        String s7=request.getParameter("t5");
        
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/web?useSSL=false&allowPublicKeyRetrieval=true","root","S@hil8055");
            Statement st=con.createStatement();
            String q="update insmarks set NAME='"+s4+"',COREJAVA='"+s5+"',ADVJAVA='"+s6+"',COREDS='"+s7+"' where ROLLNO='"+s3+"'";
            st.executeUpdate(q);
            response.sendRedirect("show.jsp?s1=Data Updated");
            
        }catch(Exception e){
            out.println(e);
        }
        } 
}else{
response.sendRedirect("login.jsp");
}
%>
