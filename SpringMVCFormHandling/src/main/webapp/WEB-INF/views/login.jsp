<html>
<head>
<title>Simple MVC Application</title>
</head>
<body>
    <p><font color="red">${errorMessage}</font></p>
    <b>${msg}</b>
    <form action="/SpringFormMvc/login" method="POST"><br /><br />
       Name : <input name="name" type="text" /> <br /><br />
       Password : <input name="password" type="password" /> <br /> <br /> 
        <input type="submit" />
    </form>
</body>
</html>