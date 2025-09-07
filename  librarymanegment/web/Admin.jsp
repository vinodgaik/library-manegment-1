<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
<head>
    <meta charset="UTF-8">
    <style>
        body{
           background-image: url('library.png')  ;
           background-repeat: no-repeat;
           background-attachment: fixed;
           background-size: 100% 100%;
              font-family: Arial, Helvetica, sans-serif;

        } 
        h1{
            color: green;
        }
        a{
            color: blue;
            font-size: 15px;
    
        }
        li{
            font-size:15px;
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
        </style>
    <title>Library Management System</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"> <!-- Assuming you have a CSS file -->
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
</body>
</html>




                            
                                                       



