<%@page import="java.sql.*"%>
<%
String s1=request.getParameter("u1");
String s2=request.getParameter("u2");
String s3=request.getParameter("u3");
String s4=request.getParameter("u4");
String s5=request.getParameter("u5");

try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/web?useSSL=false&allowPublicKeyRetrieval=true","root","S@hil8055");
    Statement st=con.createStatement();
    String q="insert into insmarks values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
    st.executeUpdate(q);
    response.sendRedirect("insert.jsp?s1=Data Inserted");
    con.close();
}catch(Exception e){
    out.println(e);
}
%>