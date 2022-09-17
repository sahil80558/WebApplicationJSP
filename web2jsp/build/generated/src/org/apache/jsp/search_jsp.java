package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/css.jsp");
    _jspx_dependants.add("/mainmenu.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

session=request.getSession();
String s1=(String)session.getAttribute("SName");
if(s1!=null){
      out.write("\n");
      out.write("    <html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("       <style> \n");
      out.write("body\n");
      out.write("{\n");
      out.write("background-image:url(fill.jpg);\n");
      out.write("background-size:100%;\n");
      out.write("background-repeat:repeat;\n");
      out.write("}\n");
      out.write("#mymenu\n");
      out.write("{\n");
      out.write("background-color:rgba(245,0,0,0.9);\n");
      out.write("color:white;\n");
      out.write("text-align:right;\n");
      out.write("}\n");
      out.write("#mymenu ul li\n");
      out.write("{\n");
      out.write("display:inline-block;\n");
      out.write("padding:25px;\n");
      out.write("}\n");
      out.write("#mymenu ul li a\n");
      out.write("{\n");
      out.write("color:white;\n");
      out.write("text-decoration:none;\n");
      out.write("}\n");
      out.write(".A\n");
      out.write("{\n");
      out.write("background:white;\n");
      out.write("text-align:center;\n");
      out.write("font-size:25px;\n");
      out.write("line-height:30px;\n");
      out.write("line-spacing:4px;\n");
      out.write("}\n");
      out.write(".U\n");
      out.write("{\n");
      out.write("/*background:lightcoral;*/\n");
      out.write("text-align:left;\n");
      out.write("font-size:20px;\n");
      out.write("line-height:30px;\n");
      out.write("line-spacing:4px;\n");
      out.write("color:white;\n");
      out.write("}\n");
      out.write("#mymenu ul li:hover\n");
      out.write("{\n");
      out.write("background-color:blue;\n");
      out.write("}\n");
      out.write(".L\n");
      out.write("{\n");
      out.write("color:white;\n");
      out.write("text-decoration:none;\n");
      out.write("}\n");
      out.write("table\n");
      out.write("{\n");
      out.write("background-color:rgba(0,0,0,0.5);\n");
      out.write("color:white;\n");
      out.write("box-shadow:10px 10px 10px black;\n");
      out.write("margin-top:25px;\n");
      out.write("}\n");
      out.write(".B\n");
      out.write("{\n");
      out.write("width:80px;\n");
      out.write("height:30px;\n");
      out.write("background:linear-gradient(red,yellow);\n");
      out.write("color:black;\n");
      out.write("}\n");
      out.write(".B:hover\n");
      out.write("{\n");
      out.write("background:linear-gradient(to right,red,yellow);\n");
      out.write("}\n");
      out.write("</style>");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<P class =\"A\">My Menu</p>\n");
      out.write("    ");
      out.write("<div id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"login.jsp\">Home</a></li>\n");
      out.write("<li><a href=\"show.jsp\">Show All</a></li>\n");
      out.write("<li><a href=\"search.jsp\">Search</a></li>\n");
      out.write("<li><a href=\"insert.jsp\">Insert</a></li>\n");
      out.write("<li><a href=\"update.jsp\">Update</a></li>\n");
      out.write("<li><a href=\"delete.jsp\">Delete</a></li>\n");
      out.write("<li><a>About</a></li>\n");
      out.write("<li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("<li><a>Contact</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>");
      out.write("\n");
      out.write("<p class=\"U\">&nbsp;&nbsp;&nbsp;Welcome&nbsp;&nbsp;");
      out.print(s1);
      out.write("</p>\n");
      out.write("<center>\n");
      out.write("    <form action=\"search.jsp\">\n");
      out.write("<table cellpadding=\"14px\">\n");
      out.write("    <tr>\n");
      out.write("        <td>Enter Roll No.</td>\n");
      out.write("        <td><input type=\"text\" placeholder=\"Enter RollNo.\"name=\"t1\"></td>\n");
      out.write("        <td><input type=\"submit\" name=\"b1\" value=\"Search\" class=\"B\"></td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("    </form>\n");
      out.write("     <form action=\"search.jsp\">\n");
      out.write("        <table cellpadding=\"15px\">\n");
      out.write("        ");

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
            
      out.write("    \n");
      out.write("             <tr>\n");
      out.write("                <td>Roll No.</td>\n");
      out.write("                <td><input type=\"text\" value=\"");
      out.print(rs.getString(1));
      out.write("\"  name=\"t1\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Name</td>\n");
      out.write("                <td><input type=\"text\" value=\"");
      out.print(rs.getString(2));
      out.write("\"  name=\"t2\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Core Java</td>\n");
      out.write("                <td><input type=\"text\" value=\"");
      out.print(rs.getString(3));
      out.write("\"  name=\"t3\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Advance Java</td>\n");
      out.write("                <td><input type=\"text\" value=\"");
      out.print(rs.getString(4));
      out.write("\"  name=\"t4\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Core DS</td>\n");
      out.write("                <td><input type=\"text\" value=\"");
      out.print(rs.getString(5));
      out.write("\" name=\"t5\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>           \n");
      out.write("            <td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Update\" name=\"b2\" class=\"B\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("    ");
}
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

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
