<%-- 
    Document   : newjsp
    Created on : 6 Apr, 2024, 12:21:55 PM
    Author     : lenovo
--%>

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
             
            .container-fluid.card{
            width: 500px;
            margin: 0 auto;
            padding: 50px;
            border: 3px solid #ccc;
            border-radius: 3px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            background-color:rgba(0,0,0,0.5);
            }
            label{
             color: white;
            }
            h1{
                color: green;
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
        <br><br><br>
        <div class="container-fluid card">
 
     
        <h1 style="text-align: center">Add a Book</h1>
        
        <form style="text-align:center" action="addbook" method="post" >
            <label for="title">Title:</label>
            <input type="text" id="title" name="title" required><br><br>
            <label for="author">Author:</label>
            <input type="text" id="author" name="author" required><br><br>
            <label for="price"> Price:</label>
            <input type="number"class="from-control " name="price" required="">
            <br><br>
             <input type="submit" value="Add Book">
             <br><br>
             <a href="Admin.jsp">Back</a>
        </form>
        </div>
    </body>
</html>
