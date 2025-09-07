package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>  \n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"rel=\"stylesheet\"\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("        body{\n");
      out.write("           background-image: url('library.png');\n");
      out.write("           background-repeat: no-repeat;\n");
      out.write("           background-attachment: fixed;\n");
      out.write("           background-size: 100% 100%;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            min-height: 100vh; /* Ensure the body takes up the full viewport height */\n");
      out.write("            margin: 0;\n");
      out.write("            \n");
      out.write("        } \n");
      out.write("           \n");
      out.write("         .login-container input[type=\"text\"],\n");
      out.write("        .login-container input[type=\"password\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 8px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 3px;\n");
      out.write("        }\n");
      out.write("        .container-fluid{\n");
      out.write("        width: 500px;\n");
      out.write("        padding: 10px;\n");
      out.write("        border: 3px solid #ccc;\n");
      out.write("        border-radius: 3px;\n");
      out.write("        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        background-color: rgba(0, 0, 0, 0.5);\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]{\n");
      out.write("             width: 80%;\n");
      out.write("            padding: 8px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: #fff;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        td{\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 20px;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        a{\n");
      out.write("            color: white;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 26px;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        td{\n");
      out.write("            padding: 15px;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"container-fluid card\" style=\"width: 40rem;\">\n");
      out.write("        <nav>\n");
      out.write("        <ul>\n");
      out.write("             \n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("    <center><h2>Login Here</h2></center>\n");
      out.write("    <center>\n");
      out.write("        <div>\n");
      out.write("            <form action=\"adminlogin\" method=\"POST\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>User Name:</td>\n");
      out.write("                    <td><input type=\"text\"class=\"from-control\" name=\"username\" pleceholder=\"User name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password:</td>\n");
      out.write("                    <td> <input type=\"password\"class=\"from-control \" name=\"password\" pleceholder=\"Password\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <br>    <tr>\n");
      out.write("                   <td colspan=\"2\" style=\"text-align: center\"><input class=\"btn btn-success\" type=\"submit\" value=\"submit\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write("            <br> <a style=\"float: right\" href=\"index.html\">Back to Home</a>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" ");
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
