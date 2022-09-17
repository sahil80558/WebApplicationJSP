package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/loginmenu.jsp");
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("     \n");
      out.write("        </script>\n");
      out.write("<style>\n");
      out.write("body\n");
      out.write("{\n");
      out.write("background-image:url('back2.jpg');\n");
      out.write("background-size:100%;\n");
      out.write("background-repeat:no-repeat;\n");
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
      out.write("#mymenu ul li:hover\n");
      out.write("{\n");
      out.write("background-color:blue;\n");
      out.write("}\n");
      out.write("table\n");
      out.write("{\n");
      out.write("background-color:rgba(0,0,0,0.5);\n");
      out.write("color:white;\n");
      out.write("box-shadow:10px 10px 10px black;\n");
      out.write("margin-top:170px;\n");
      out.write("}\n");
      out.write("#data\n");
      out.write("{\n");
      out.write("/*margin-top:400px;*/\n");
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
      out.write("#mymenu ul li a\n");
      out.write("{\n");
      out.write("color:white;\n");
      out.write("text-decoration:none;\n");
      out.write("}\n");
      out.write(".p\n");
      out.write("{\n");
      out.write("    color:white;\n");
      out.write("    /*margin-top:140px;*/\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("<div id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"login.jsp\">Home</a></li>\n");
      out.write("<li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("<li><a href=\"regis.jsp\">Registration</a></li>\n");
      out.write("<li>About</li>\n");
      out.write("<li>Contact</li>\n");
      out.write("</ul>\n");
      out.write("</div>");
      out.write("\n");
      out.write("<center>\n");
      out.write("      ");

    String s1=request.getParameter("s1");
    if(s1!=null){
    
      out.write("\n");
      out.write("    <p align=\"center\" class=\"p\">");
      out.print(s1);
      out.write("</p>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("    <!--<img src=\"user1.png\">-->\n");
      out.write("<form action=\"login1.jsp\" method=\"post\">  \n");
      out.write("<table cellpadding= \"18px\">\n");
      out.write("<tr>\n");
      out.write("<td>Enter Name</td>\n");
      out.write("<td><input type =\"text\" placeholder =\"Enter Name\" name=\"un\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Enter Password</td>\n");
      out.write("<td><input  type =\"password\" placeholder =\"Enter Password\" name=\"up\" required id=\"pass\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\" colspan=\"2\"><input class =\"B\" type=\"submit\" value=\"Login\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>");
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
