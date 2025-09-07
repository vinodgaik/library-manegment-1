<%-- 
    Document   : newjsp
    Created on : 6 Apr, 2024, 12:21:55 PM
    Author     : lenovo
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.db.Dbcon"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <style>
             body{
           background-image: url('library.png')  ;
           background-repeat: no-repeat;
           background-attachment: fixed;
           background-size: 100% 100%;
             font-family: Arial, Helvetica, sans-serif;

             }
            .contener1{
                
             width: 100; 
             height: 90px;
              
            }
            header {
              background-color: rgba(0,0,0,0.5);
              padding: 10px;
              text-align:left;
              font-size: 15px;
              color: white;
            }
            
            li{
                float: left;
                text-decoration: none;
                list-style: none;
                padding: 10px 10px 10px;
            }
             
                
            
             h1{
                color: green;
            }
            .container{
                max-width: 800px;
                margin: 50px auto;
                padding: 20px;
                background-color: rgba(0,0,0,0.5);
                border-radius: 10px;
            }
            h3{
                text-align: center;
                
            }
            table{
                width: 100%;
                border-collapse: collapse;
                margin-top: 20px;
                border: 1px solid #fff;
            }
             
            th{
                color: white;
                background-color: #333;
            }
            td{
                color: white;
                text-align: center;
            }
            tr:nth-child(even){
                background-color: rgba(255,255,255,0.1);
                
            }         
            h3{
              color: white;
              
            }
            a{
                color: blue;
            }
        </style>
        <title>JSP Page</title>
    </head>
    <body>
      <div class="contener1">
            <nav>
                <ul>
                    <header>
                    <h1>Admin</h1>
                    <a  href="add_book.jsp">Add Book</a><br>
                    <a  href="customerrecord.jsp">View Customer Record</a>
                    <br><br>
                    </header>
                </ul>
            </nav>
        </div>
        <br>
        <div class="container">
            <h3>customer Records</h3>
              
            <table>
                <thead>
                    <tr>
                         <th>id</th>
                        <th>customer name</th>
                        <th>book name</th>
                        
                          <th>Price</th>
                          <th>quantity</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        String sql="SELECT * FROM `buy`";
                        
                        Statement statement = Dbcon.connect();

                        ResultSet rs = statement.executeQuery(sql);
                        while(rs.next()) {
                            
                          %>
                        <tr>
                            <td><%=rs.getString("id")%></td>
                             <td><%=rs.getString("customername")%></td>
                              <td><%=rs.getString("bookname")%></td>
                                
                               <td><%=rs.getString("price")%></td>
                                    <td><%=rs.getString("quantity")%></td>
                                 
                             
                        </tr>
                        <%}%>
                </tbody>
            </table>
                   
        </div>
    </body>
</html>
