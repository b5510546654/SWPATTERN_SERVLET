<!DOCTYPE html>
<html>
	<head>
		<title>external page</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="css/jquery.mobile-1.3.0.min.css" />
		<script src="jquery-1.8.2.min.js"></script>
		<script src="jquery.mobile-1.3.0.min.js"></script>
		
		<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	    pageEncoding="ISO-8859-1"%>
	</head>

	<body>        
		<div data-role="page" id="sampage" data-add-back-btn="true">
			<div data-role="header" >
				<h1>Login Page</h1>
			</div>
			<!-- /header -->
			<div data-role="content">
				<form action="login" method="post">
					Login : <input type="text" name="id" id="id" /><br>
					Password : <input type="text" name="password" id="password"/><br>
					<input type="submit" name="submit" value="ok"/>
				</form>
			</div>
			<!-- /content -->
			<div data-role="footer">			
			</div>
			<!-- /footer -->
		</div>
	</body>
</html>
    
    
    
    
    
    
    
    




    
    
    
    
    
    
    




