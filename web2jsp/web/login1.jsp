<%@page import="java.sql.*" %>
<style>
    .p
    {
        color:white;
    }
</style>
<%
String s1=request.getParameter("un");
String s2=request.getParameter("up");

try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/web?useSSL=false&allowPublicKeyRetrieval=true","root","S@hil8055");
    Statement st=con.createStatement();
    String q="select * from regis where UNAME='"+s1+"' and UPASS='"+s2+"'";
    ResultSet rs=st.executeQuery(q);
    if(rs.next()){
        session =request.getSession();
        session.setAttribute("SName",s1);
        response.sendRedirect("menu1.jsp");
       }else{
            out.println("<p align='center' class='p'>Wrong Username and Password</p>");
            RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
            rd.include(request,response);
    }
}catch(Exception e){
    out.println(e);
}
%>