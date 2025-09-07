package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.db.Dbcon;
import java.sql.Statement;

public final class Books_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("        body{\n");
      out.write("           background-image: url('library.png')  ;\n");
      out.write("           background-repeat: no-repeat;\n");
      out.write("           background-attachment: fixed;\n");
      out.write("           background-size: 100% 100%;\n");
      out.write("            \n");
      out.write("        } \n");
      out.write("        </style>\n");
      out.write("        <title>Books</title>\n");
      out.write("   \n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-size: cover;\n");
      out.write("                font-family: Arial,sans-serif;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            .container{\n");
      out.write("                max-width: 800px;\n");
      out.write("                margin: 50px auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                background-color: rgba(0,0,0,0.5);\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("            h3{\n");
      out.write("                text-align: center;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                border: 1px solid #fff;\n");
      out.write("            }\n");
      out.write("            th{\n");
      out.write("                background-color: #333;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            tr:nth-child(even){\n");
      out.write("                background-color: rgba(255,255,255,0.1);\n");
      out.write("                \n");
      out.write("            }                \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3>Books</h3>\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                         <th>Book_id</th>\n");
      out.write("                        <th>Title</th>\n");
      out.write("                        <th>Author</th>\n");
      out.write("                        \n");
      out.write("                          <th>Price</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        String sql="SELECT * FROM `books`";
                        
                        Statement statement = Dbcon.connect();
                        ResultSet rs = statement.executeQuery(sql);
                        while(rs.next()) {
                            
                          
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(rs.getString("id"));
      out.write("</td>\n");
      out.write("                             <td>");
      out.print(rs.getString("title"));
      out.write("</td>\n");
      out.write("                              <td>");
      out.print(rs.getString("author"));
      out.write("</td>\n");
      out.write("                                \n");
      out.write("                               <td>");
      out.print(rs.getString("price"));
      out.write("</td>\n");
      out.write("                                <td><a href=\"Buy.jsp?id=");
      out.print(rs.getString("id"));
      out.write("\">Buy Now</a></td> \n");
      out.write("                             \n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("                   \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("  ");
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
