<%@page import="java.sql.*" %>
<%
String s1=request.getParameter("un");
String s2=request.getParameter("up");
String s3=request.getParameter("uc");

try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/web?useSSL=false&allowPublicKeyRetrieval=true","root","S@hil8055");
    Statement st=con.createStatement();
    String q="insert into regis Values('"+s1+"','"+s2+"','"+s3+"')";
    st.executeUpdate(q);
    response.sendRedirect("login.jsp?s1=Registered Succesfully");
    con.close();
}catch(Exception e){
    out.println(e);
}
%>