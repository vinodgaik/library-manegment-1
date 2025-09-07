 
package controller;

import com.db.Dbcon;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class register extends HttpServlet {

     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
        try {
      
             String Name = request.getParameter("Name");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
             Statement st=Dbcon.connect();
             
            String sql="INSERT INTO `bookdata`(`id`,`Name`,`username`,`password`) VALUES (null,'"+Name+"','"+username+"','"+password+"')";
            System.out.println("sql"+sql);
              st.executeUpdate(sql);
              response.sendRedirect("login.jsp");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            processRequest(request, response);

        } catch (Exception ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
