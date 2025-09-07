<%@page import="java.sql.ResultSet"%>
<%@page import="com.db.Dbcon"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
            
        } 
        </style>
        <title>Books</title>
   
        <style>
            body{
                background-size: cover;
                font-family: Arial,sans-serif;
                margin: 0;
                padding: 0;
                color: #fff;
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
                background-color: #333;
            }
            td{
                text-align: center;
            }
            tr:nth-child(even){
                background-color: rgba(255,255,255,0.1);
                
            }                
            
        </style>
    </head>
    <body>
        <div class="container">
            <h3>Books</h3>
            <table>
                <thead>
                    <tr>
                         <th>Book_id</th>
                        <th>Title</th>
                        <th>Author</th>
                        
                          <th>Price</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        String sql="SELECT * FROM `books`";
                        
                        Statement statement = Dbcon.connect();
                        ResultSet rs = statement.executeQuery(sql);
                        while(rs.next()) {
                            
                          %>
                        <tr>
                            <td><%=rs.getString("id")%></td>
                             <td><%=rs.getString("title")%></td>
                              <td><%=rs.getString("author")%></td>
                                
                               <td><%=rs.getString("price")%></td>
                                <td><a href="Buy.jsp?id=<%=rs.getString("id")%>">Buy Now</a></td> 
                             
                        </tr>
                        <%}%>
                </tbody>
            </table>
                   
        </div>
        
    </body>
</html>
  