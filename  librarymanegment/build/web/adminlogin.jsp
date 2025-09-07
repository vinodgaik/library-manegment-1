<%-- 
    Document   : login
    Created on : 15 Mar, 2024, 3:23:39 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>  
    <head>
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"rel="stylesheet"
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
        body{
           background-image: url('library.png');
           background-repeat: no-repeat;
           background-attachment: fixed;
           background-size: 100% 100%;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh; /* Ensure the body takes up the full viewport height */
            margin: 0;
            
        } 
           
         .login-container input[type="text"],
        .login-container input[type="password"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        .container-fluid{
        width: 500px;
        padding: 30px;
        border: 3px solid #ccc;
        border-radius: 3px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        background-color: rgba(0, 0, 0, 0.5);
        }
        input[type="submit"]{
             width: 80%;
            padding: 8px;
            border: none;
            border-radius: 3px;
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
        }
        td{
            font-weight: bold;
            font-size: 20px;
            color: white;
        }
        a{
            color: white;
            font-size: 20px;
        }
        h2{
            color: green;
        }
        td{
            padding: 15px;
        }
        </style>
    </head>
    <body>
        
     <center>
        <div class="container-fluid">
            <center><h2>Login Here</h2></center>
            <form action="adminlogin" method="POST">
            <table>
                <tr>
                    <td>User Name:</td>
                    <td><input type="text"class="from-control" name="username" pleceholder="User name"></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td> <input type="password"class="from-control " name="password" pleceholder="Password"></td>
                </tr>
                <br>    <tr>
                   <td colspan="2" style="text-align: center"><input class="btn btn-success" type="submit" value="submit"></td>
                </tr>
            </table>
            </form>
            <br> <a style="float: right" href="index.html">Back to Home</a>
        </div>
    </center>  
    </body>
</html>
  