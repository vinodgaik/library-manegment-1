<%-- 
    Document   : Buy
    Created on : 26 Mar, 2024, 12:33:24 PM
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
            
        } 
        </style>
        <title>Buy Now</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body>
        <nav>
        <ul>
            
        </ul>
    </nav>
    <center><h2>Buy Now</h2></center>
    <center>
        <div>
            <form action="buy" method="POST">
            <table>
                <tr>
                    <td>Customer Name:</td>
                    <td><input type="text"class="from-control" name="customername" pleceholder="customername"></td>
                </tr>
                <tr>
                    <td>Book Name:</td>
                    <td> <input  type="text"class="from-control " name="bookname" pleceholder="bookname"></td>
                </tr>
                <tr>
                    <td>Book Price:</td>
                    <td> <input type="number"class="from-control " name="price" pleceholder="price"></td>
                </tr>
                <tr>
                    <td>Book Quantity:</td>
                    <td> <input type="number"class="from-control " name="quantity" pleceholder="quantity"></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"><input class="btn btn-success" type="submit" value="submit"></td>
                </tr>   
            </table>
            </form>
        </div>
    </center>
    </body>
</html> 
   