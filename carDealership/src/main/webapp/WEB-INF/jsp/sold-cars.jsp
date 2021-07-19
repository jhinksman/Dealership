<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.84.0">
<title>Sold Vehicles</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.0/examples/album/">



<!-- Bootstrap core CSS -->
<!-- site where the CSS is coming from -->
<link
	href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>


</head>
<body>

	<header>
		<div class="collapse bg-dark" id="navbarHeader">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-md-7 py-4">
						<h4 class="text-white">About</h4>
						<p class="text-muted">In oder to purchase one of our
							magnificent vehicles, please either login to an existing account,
							or register a new account</p>
					</div>
					<div class="col-sm-4 offset-md-1 py-4">
						<h4 class="text-white">Contact</h4>
						<ul class="list-unstyled">
							<li><a href="#" class="text-white">Follow on Twitter</a></li>
							<li><a href="#" class="text-white">Like on Facebook</a></li>
							<li><a href="#" class="text-white">Email me</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="navbar navbar-dark bg-dark shadow-sm">
			<div class="container">
				<a href="#" class="navbar-brand d-flex align-items-center"> <svg
						xmlns="http://www.w3.org/2000/svg" width="20" height="20"
						fill="none" stroke="currentColor" stroke-linecap="round"
						stroke-linejoin="round" stroke-width="2" aria-hidden="true"
						class="me-2" viewBox="0 0 24 24">
						<path
							d="M23 19a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h4l2-3h6l2 3h4a2 2 0 0 1 2 2z" />
						<circle cx="12" cy="13" r="4" /></svg> <strong>Album</strong>
				</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarHeader"
					aria-controls="navbarHeader" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
			</div>
		</div>
	</header>

	<main>

		<section class="py-5 text-center container">
			<div class="col-lg-6 col-md-8 mx-auto">
				<h1 class="fw-light">${loggedIn.firstName}${loggedIn.lastName}</h1>
				<p class="lead text-muted">If you're seeing this, you're an
					admin. So all these cars have been sold. Please click below if you'd like to add a car to the new car inventory.</p>
				<p>
					<a href="/login" class="btn btn-primary my-2">Login</a> <a
						href="/addCar" class="btn btn-secondary my-2">Add to Inventory</a>
				</p>
			</div>
			</div>
		</section>

		<div class="album py-5 bg-light">
			<div class="container">
	<br>
								<table class="table table-striped table-hover">
									<thead>
										<tr>
											
											<th>Transaction ID</th>
											<th>Sale Date</th>
											<th>Customer Name</th>
											<th>Vehicle Status</th>
											<th>Make</th>
											<th>Model</th>
											<th>Price</th>
										</tr>
									</thead>
								<tbody>
									<c:forEach var="item" items="${transactions}">
										<tr>
											<td>${item.transactionId}</td>
											<td>${item.dateOfPurchase}</td>
											<td>${item.customer.email}</td>
											<td>${item.cars.newOrUsed}</td>
											<td>${item.cars.make}</td>
											<td>${item.cars.model}</td>
											<td>$${item.cars.price}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
				
				</div>
			</div>
		</div>

	</main>

	<footer class="text-muted py-5">
		<div class="container">
			<p class="float-end mb-1">
				<a href="#">Back to top</a>
			</p>
		</div>
	</footer>


	<script src="../assets/dist/js/bootstrap.bundle.min.js"></script>


</body>
</html>
