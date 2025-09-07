package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <style>\n");
      out.write("             body{\n");
      out.write("           background-image: url('library.png')  ;\n");
      out.write("           background-repeat: no-repeat;\n");
      out.write("           background-attachment: fixed;\n");
      out.write("           background-size: 100% 100%;\n");
      out.write("             }\n");
      out.write("            .contener1 {\n");
      out.write("            width: 100%; /* Full width of the parent container */\n");
      out.write("            height: 90px;\n");
      out.write("            background: sienna;\n");
      out.write("            padding: 10px; /* Add padding to create some space between content and container edges */\n");
      out.write("            box-sizing: border-box; /* Include padding in the width calculation */\n");
      out.write("            border: 2px solid black; /* Add a border with a size of 2 pixels and color black */\n");
      out.write("            text-align: center; /* Align text in the center horizontally */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("            \n");
      out.write("            li{\n");
      out.write("                float: left;\n");
      out.write("                text-decoration: none;\n");
      out.write("                list-style: none;\n");
      out.write("                padding: 10px 10px 10px;\n");
      out.write("            }\n");
      out.write("             \n");
      out.write("            .container-fluid.card{\n");
      out.write("            width: 500px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            padding: 50px;\n");
      out.write("            border: 5px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            background-color:rgba(0,0,0,0.5);\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("             color: white;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"contener1\">\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <h1>Admin</h1>\n");
      out.write("                    <a  href=\"add_book.jsp\">Add Book</a><br>\n");
      out.write("                    <a  href=\"customerrecord.jsp\">View Customer Record</a>\n");
      out.write("                    <br><br>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"container-fluid card\">\n");
      out.write(" \n");
      out.write("     \n");
      out.write("        <h1 style=\"text-align: center\">Add a Book</h1>\n");
      out.write("        \n");
      out.write("        <form style=\"text-align:center\" action=\"addbook\" method=\"post\" >\n");
      out.write("            <label for=\"title\">Title:</label>\n");
      out.write("            <input type=\"text\" id=\"title\" name=\"title\" required><br><br>\n");
      out.write("            <label for=\"author\">Author:</label>\n");
      out.write("            <input type=\"text\" id=\"author\" name=\"author\" required><br><br>\n");
      out.write("            <label for=\"price\"> Price:</label>\n");
      out.write("            <input type=\"number\"class=\"from-control \" name=\"price\" required=\"\">\n");
      out.write("            <br><br>\n");
      out.write("             <input type=\"submit\" value=\"Add Book\">\n");
      out.write("             <br><br>\n");
      out.write("             <a href=\"Admin.jsp\">Back</a>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
