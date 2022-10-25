<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Student Management System</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

	<nav class="navbar navbar-expand-md bg-dark navbar-dark">
		<!-- Brand -->
		<a class="navbar-brand" href="#"></a>

		<!-- Toggler/collapsibe Button -->
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
	</nav>
	<br>
	<br>
	<br>
	  <div class="container">
		<div class="row">
			<div
				class="col-lg-6 col-md-6 col-sm-6 container justify-content-center card">
				<h1 class="text-center">Add New Customer Detail</h1>
				<div class="card-body">
					<form action="add" method="POST">
						<div class="form-group">
						
							<label> Enter Product Name </label> <input type="text"
								name="name" th:field="*{name}" class="form-control"
								placeholder="Name" required />
						</div>
						
						<div class="form-group">
							<label> Product Description </label> 
							<input  name="descr" th:field="*{descr}" class="form-control"
								placeholder="Description" required />
						</div>
						
						<div class="form-group">
							<label> Product Price </label> 
							<input type="text"
								name="price" th:field="*{price}" class="form-control"
								placeholder="Price" required />
						</div>
						
						<div class="box-footer">
							<button type="submit" class="btn btn-primary">Submit</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>