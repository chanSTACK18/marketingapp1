<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Create Lead || FORM</title>
	<!-- Bootstrap v5.1.3 CDNs -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    
    <!-- CSS File -->
    <link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="form-page">
		<h1 class="text-center">Enter Lead Information</h1>
		<form action="saveLead" method="post">
			<div class="form-group">
				<label class="form-label" ></label>
				<input class="form-control" type="text" placeholder="First Name" name="firstName"/>
			</div>
			<div class="form-group">
				<label class="form-label" ></label>
				<input class="form-control" type="text" placeholder="Last Name" name="lastName"/>
			</div>
			<div class="form-group">
				<label class="form-label"></label>
				<input class="form-control" type="email" placeholder="name@example.com" name="email"/>
			</div>
			<div class="form-group">
				<label class="form-label" ></label>
				<input class="form-control" type="text" placeholder="9090XXXX76" name="mobile"/>
			</div>
			<input class="btn btn-success w-100" type="submit" value="SAVE"/>
		</form>
	</div>
</body>
</html>