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
<title>Album example · Bootstrap v5.0</title>

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

	</header>

	<main>

		<section class="py-5 text-center container">
			<div class="col-lg-6 col-md-8 mx-auto">
				<h1 class="fw-light">Album example</h1>
				<p class="lead text-muted">If a car has been in our inventory
					for over 120 days you may place a bid on this car for a possible
					discount! Otherwise feel free to simply purchase any vehicle you would like!</p>
				<p>
					<a href="/index" class="btn btn-primary my-2">Home</a>
				</p>
			</div>
			</div>
		</section>

		<div class="album py-5 bg-light">
			<div class="container">

				<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">

					<div class="col">
						<div class="card shadow-sm">
							<img alt="${details.carDescription}" src="${details.pictures}"
								width="100%" height="225">
							<div class="card-body">
								<p class="card-text">${details.carDescription}<br>
									<br> Type: ${details.newOrUsed}<br>
									<br> Make: ${details.make}<br>
									<br> Model: ${details.model}<br>
									<br> Kilometers ran: ${details.kilometersRan}
								</p>
								<div class="d-flex justify-content-between align-items-center">
									<div class="btn-group">
										<c:choose>
											<c:when test="${purchaseAge> 120}">
											
												<form:form class="row contact_form"
													action="bid?vin=${details.vin}"
													method="post" novalidate="novalidate">
													<div class="col-md-7 form-group p_star">
														<input type="number" class="form-control" id="bidAmount"
															name="bidAmount" placeholder="Bid Amount">
													</div>
													<a type="button" class="btn btn-sm btn-outline-secondary"
													href="bid?vin=${details.vin}&email=${loggedIn.email}">Place bid!</a>
												</form:form>



										  <!--  		<a type="button" class="btn btn-sm btn-outline-secondary"
													href="bid?vin=${details.vin}&email=${loggedIn.email}">Bid
													now</a>  	-->
											</c:when>


											<c:otherwise>

												<a type="button" class="btn btn-sm btn-outline-secondary"
													href="purchase?vin=${details.vin}&email=${loggedIn.email}">Purchase</a>
											</c:otherwise>
										</c:choose>


									</div>
									<small class="text-muted">$${details.price}</small>
								</div>
							</div>
						</div>
					</div>


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
