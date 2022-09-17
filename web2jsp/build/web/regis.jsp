<%@page import="java.sql.*" %>
<html>
<head>
<style>
body
{
background-image:url('back1.jpg');
background-size:100%;
background-repeat:no-repeat;
}
#mymenu
{
background-color:rgba(245,0,0,0.9);
color:white;
text-align:right;
text-decoration:none;
}
#mymenu ul li
{
display:inline-block;
padding:25px;

}
#mymenu ul li:hover
{
background-color:blue;
}
table
{
background-color:rgba(0,0,0,0.5);
color:white;
box-shadow:10px 10px 10px black;
margin-top:200px;
}
#data
{
margin-top:400px;
}
.B
{
width:80px;
height:30px;
background:linear-gradient(red,yellow);
color:black;
}
.B:hover
{
background:linear-gradient(to right,red,yellow);
}
#mymenu ul li a
{
color:white;
text-decoration:none;
}
</style>
</head>
<body>
    <%@include file="loginmenu.jsp" %> 
<center>
<form action="regis1.jsp" method="post">
<table cellpadding= "15px">
<tr>
<td>Enter Name</td>
<td><input type ="text" placeholder ="Enter Name" name="un" required></td>
</tr>
<tr>
<td>Enter Password</td>
<td><input  type ="password" placeholder ="Enter Password" name="up" required></td>
</tr>
<tr>
<td>Enter Email</td>
<td><input  type ="text" placeholder ="Enter Email" name="uc" required></td>
</tr>
<tr>
<td align="center" colspan="2"><input class ="B" type="submit" value="Register"></td>
</tr>
</table>
</form>
</center>
</body>
</html>