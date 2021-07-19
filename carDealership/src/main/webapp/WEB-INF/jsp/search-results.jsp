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
<title>For Sale Inventory</title>

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
		<div class="navbar navbar-dark bg-dark shadow-sm">
			<div class="container">
				<a href="/index" class="navbar-brand d-flex align-items-center"> <svg
						xmlns="http://www.w3.org/2000/svg" width="20" height="20"
						fill="none" stroke="currentColor" stroke-linecap="round"
						stroke-linejoin="round" stroke-width="2" aria-hidden="true"
						class="me-2" viewBox="0 0 24 24">
						<path
							d="M23 19a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h4l2-3h6l2 3h4a2 2 0 0 1 2 2z" />
						<circle cx="12" cy="13" r="4" /></svg> <strong>Home</strong>
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
					<h1 class="fw-light">${loggedIn.firstName} ${loggedIn.lastName}</h1>
					<p class="lead text-muted">In oder to purchase one of our
						magnificent vehicles, please either login to an existing account,
						or register a new account</p>
					<p>
						<a href="/login" class="btn btn-primary my-2">Login</a> <a
							href="/search" class="btn btn-secondary my-2">Search by Model</a>
					</p>
				</div>
			</div>
		</section>

		<div class="album py-5 bg-light">
			<div class="container">

				<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
				<c:choose>
					<c:when test="${not empty allCars}">
					
						
						<c:forEach var="cars" items="${allCars}">
						<div class="col">
						<!--
						
						how to print to the HTML to find errors
						<c:out value=""></c:out> 
						
						-->
						<div class="card shadow-sm">
							<img alt="${cars.carDescription}" src="${cars.pictures}" width="100%"
								height="225">

							<div class="card-body">
								<p class="card-text">
								
								
								${cars.carDescription}</p>
									
									
								<div class="d-flex justify-content-between align-items-center">
									<div class="btn-group">
										<a type="button" class="btn btn-sm btn-outline-secondary"
											href="details?vin=${cars.vin}">View</a> <a type="button"
											class="btn btn-sm btn-outline-secondary" href="/login">Edit</a>
									</div>
									<small class="text-muted">$${cars.price}</small>
								</div>
							</div>
								</div>
					</div>
							</c:forEach>
					
					</c:when>
					<c:otherwise>
						<h3>Out of stock for that model. Try searching again</h3>
						</c:otherwise>
					</c:choose>
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
