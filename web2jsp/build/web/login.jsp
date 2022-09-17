<html>
<head>
    <script type="text/javascript">
     
        </script>
<style>
body
{
background-image:url('back2.jpg');
background-size:100%;
background-repeat:no-repeat;
}
#mymenu
{
background-color:rgba(245,0,0,0.9);
color:white;
text-align:right;
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
margin-top:170px;
}
#data
{
/*margin-top:400px;*/
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
.p
{
    color:white;
    /*margin-top:140px;*/
}
</style>
</head>
<body>
    <%@include file="loginmenu.jsp" %>
<center>
      <%
    String s1=request.getParameter("s1");
    if(s1!=null){
    %>
    <p align="center" class="p"><%=s1%></p>
    <%}%>
    <!--<img src="user1.png">-->
<form action="login1.jsp" method="post">  
<table cellpadding= "18px">
<tr>
<td>Enter Name</td>
<td><input type ="text" placeholder ="Enter Name" name="un" required></td>
</tr>
<tr>
<td>Enter Password</td>
<td><input  type ="password" placeholder ="Enter Password" name="up" required id="pass"></td>
</tr>
<tr>
<td align="center" colspan="2"><input class ="B" type="submit" value="Login"></td>
</tr>
</table>
</form>
</center>
</body>
</html>