<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"rel="stylesheet">
          
          <title>login </title>
    <style>
        body {
             background-image: url('library.png');
           background-repeat: no-repeat;
           background-attachment: fixed;
           background-size: 100% 100%;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh; /* Ensure the body takes up the full viewport height */
            margin: 0; /* Remove default margin */
                } 
        .login-container {
        width: 500px;
        padding: 30px;
        border: 3px solid #ccc;
        border-radius: 3px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        background-color: rgba(0, 0, 0, 0.5);
        }
        a{ 
            color: white;
            font-size: 20px;
        }
        td{ 
            font-weight: bold;
            font-size: 20px;
            color: white;
            padding: 11px;
        }
        h2{
            color: green;
        }
        .login-container h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .login-container input[type="text"],
        .login-container input[type="password"] {
            width: 100%;
            padding: 7px;
            margin-bottom: 8px;
            border: 1px solid #ccc;
            border-radius: 3px;
        } 
        .login-container input[type="submit"] {
            width: 70%;
            padding: 10px;
            border: none;
            border-radius: 3px;
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
        }
        .login-container input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Login Here</h2>
        <form action="userlogin" method="POST">
            <table>
                <tr>
                    <td>User Name:</td>
                    <td><input type="text"class="from-control" name="username" pleceholder="User name"></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td> <input type="password"class="from-control " name="password" pleceholder="Password"></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"><input class="btn btn-success" type="submit" value="submit"></td>
                </tr>
            </table>
            </form>
        <br> <a style="float: right" href="index.html">Back to Home</a>
    </div>
</body>

 