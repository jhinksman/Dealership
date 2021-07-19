<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="utf-8">
<title>Student Portal</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.4/examples/cover/">

<!-- Bootstrap core CSS -->
<link
	href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">


<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<!-- Custom styles for this template -->
<link href="cover.css" rel="stylesheet">
</head>


<body class="text-center">
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">


		<main role="main" class="inner cover">


			<form:form action="/sign-up" modelAttribute="customer" method="post">

				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputFirstName">First Name</label> <form:input type="text"
							path="firstName" class="form-control" id="inputFirstName" />
					</div>
					<div class="form-group col-md-6">
						<label for="inputLastName">Last Name</label> <form:input type="text"
							path="lastName" class="form-control" id="inputLastName" />
					</div>
				</div>


				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="age">age</label> <form:input class="form-control" path="age" />
					</div>
					<div class="form-group col-md-6">
						<label for="inputEmail4">Email</label> <form:input type="email"
							path="email" class="form-control" id="inputEmail4" />
					</div>
				</div>

				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputPassword4">Password</label> <form:input
							path="password" type="password" class="form-control" id="inputPassword4" />
					</div>
				</div>
				<div class="form-group">
					<label for="inputAddress">Street</label> <form:input type="text"
						path="address.street" class="form-control" id="inputAddress" placeholder="1234 Main St" />
				</div>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputCity">City</label> <form:input type="text"
							path="address.city" class="form-control" id="inputCity" />
					</div>
					<div class="form-group col-md-4">
						<label for="inputState">State</label> <form:select path="address.state" id="inputState"
							class="form-control">
							<option selected>Choose...</option>
							<option value="AL">AL</option>
							<option value="AK">AK</option>
							<option value="AR">AR</option>
							<option value="AZ">AZ</option>
							<option value="CA">CA</option>
							<option value="CO">CO</option>
							<option value="CT">CT</option>
							<option value="DE">DE</option>
							<option value="FL">FL</option>
							<option value="GA">GA</option>
							<option value="HI">HI</option>
							<option value="ID">ID</option>
							<option value="IL">IL</option>
							<option value="IN">IN</option>
							<option value="IA">IA</option>
							<option value="KS">KS</option>
							<option value="KY">KY</option>
							<option value="LA">LA</option>
							<option value="ME">ME</option>
							<option value="ME">MD</option>
							<option value="MA">MA</option>
							<option value="MI">MI</option>
							<option value="MN">MN</option>
							<option value="MS">MS</option>
							<option value="MO">MO</option>
							<option value="MT">MT</option>
							<option value="NE">NE</option>
							<option value="NV">NV</option>
							<option value="NH">NH</option>
							<option value="NJ">NJ</option>
							<option value="NM">NM</option>
							<option value="NC">NC</option>
							<option value="ND">ND</option>
							<option value="NY">NY</option>
							<option value="OH">OH</option>
							<option value="OK">OK</option>
							<option value="OR">OR</option>
							<option value="PA">PA</option>
							<option value="RI">RI</option>
							<option value="SC">SC</option>
							<option value="SD">SD</option>
							<option value="TN">TN</option>
							<option value="TX">TX</option>
							<option value="UT">UT</option>
							<option value="VA">VA</option>
							<option value="VT">VT</option>
							<option value="WA">WA</option>
							<option value="WI">WI</option>
							<option value="WV">WV</option>
							<option value="WY">WY</option>
						</form:select>
					</div>
					<div class="form-group col-md-2">
						<label for="inputZipCode">ZipCode</label> <form:input type="text"
							path="address.zipCode" class="form-control" id="inputZipCode" />
					</div>
				</div>
				<div class="form-group">
					<div class="form-check">
						<input class="form-check-input" type="checkbox" id="gridCheck">
						<label class="form-check-label" for="gridCheck"> Check me
							out </label>
					</div>
				</div>
				<button type="submit" class="btn btn-primary">Sign up</button>
			</form:form>


		</main>

		<footer class="mastfoot mt-auto">
			<div class="inner">
				<p>
					Cover template for <a href="https://getbootstrap.com/">Bootstrap</a>,
					by <a href="https://twitter.com/mdo">@mdo</a>.
				</p>
			</div>
		</footer>
	</div>


</body>

</html>


