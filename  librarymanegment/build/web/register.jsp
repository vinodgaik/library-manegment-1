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
    <title>JSP Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container-fluid card" style="width: 40rem;">

<nav>
    <ul>
        <li><a href="index.html">Home</a></li>
    </ul>
</nav>

<h2 class="bg-danger bg-danger text-white text-white text-center"> Registration</h2>
<form action="register" method="post">
    <table class="table table table-hover">
        <tr>
            <td>Name</td>
            <td><input type="text" name="Name"></td>
        </tr>
        <tr>
            <td>username</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>password</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="REGISTER"></td>
            <td><input type="reset" value="Cancel"></td>
        </tr>
    </table>
</form>

</body>
</html>
