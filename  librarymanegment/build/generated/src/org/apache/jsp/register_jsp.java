package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body class=\"container-fluid card\" style=\"width: 40rem;\">\n");
      out.write("\n");
      out.write("<nav>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<h2 class=\"bg-danger bg-danger text-white text-white text-center\">Book Registration</h2>\n");
      out.write("<form action=\"register\" method=\"post\">\n");
      out.write("    <table class=\"table table table-hover\">\n");
      out.write("        <tr>\n");
      out.write("            <td>Name</td>\n");
      out.write("            <td><input type=\"text\" name=\"Name\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>username</td>\n");
      out.write("            <td><input type=\"text\" name=\"username\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>password</td>\n");
      out.write("            <td><input type=\"text\" name=\"password\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td><input type=\"submit\" value=\"REGISTER\"></td>\n");
      out.write("            <td><input type=\"reset\" value=\"Cancel\"></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
