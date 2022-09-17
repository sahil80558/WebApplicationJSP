package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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


session=request.getSession();
String s1=(String)session.getAttribute("SName");
if(s1!=null){
      out.write("\n");
      out.write("    <html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<P class =\"A\">My Menu</p>\n");
      out.write("    ");
      out.write("<div id=\"mymenu\">\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"login.jsp\">Home</a></li>\n");
      out.write("<li><a href=\"show\">Show All</a></li>\n");
      out.write("<li><a href=\"ssearch\">Search</a></li>\n");
      out.write("<li><a href=\"sinsert\">Insert</a></li>\n");
      out.write("<li><a href=\"supdate\">Update</a></li>\n");
      out.write("<li><a href=\"sdelete\">Delete</a></li>\n");
      out.write("<li><a>About</a></li>\n");
      out.write("<li><a href=\"login.jsp\">Logout</a></li>\n");
      out.write("<li><a>Contact</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write(" ");
   
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
