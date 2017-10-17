<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Freelancer - Start Bootstrap Theme</title>
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript">
	$(function() {
		$(document).ready(function() { // 로딩시 alert
			alert("안녕 효현이라능");
		});
		$('#sendLoginButton').click(function() {
			alert("sdsd?");
			var mId = $("#loginId").val();
			var passwd = $("#loginPasswd").val();

			$.ajaxSettings.traditional = true;
			$.ajax({
				type : 'POST',
				url : 'member/login.action',
				data : {
					mId : mId,
					passwd : passwd,
				},
				success : function(data, status, xhr) {
					if (data == 'success') {
						alert("성공.")
					} else if (data == 'error') {
						alert("실패.")
					}
				},
			})
		})
	})
</script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/include/header.jsp" />
	<!-- Contact Section -->
	<br>
	<br>
	<br>
	<section id="contact">
		<div class="container">
			<h2 class="text-center">Contact Me</h2>
			<hr class="star-primary">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. -->
					<!-- The form should work on most web servers, but if the form is not working you may need to configure your web server differently. -->
					<form name="sentMessage" id="loginForm" novalidate>
						<div class="control-group">
							<div class="form-group floating-label-form-group controls">
								<label>ID</label> <input class="form-control" id="loginId"
									type="text" placeholder="ID" required
									data-validation-required-message="Please enter your id.">
								<p class="help-block text-danger"></p>
							</div>
						</div>
						<div class="control-group">
							<div class="form-group floating-label-form-group controls">
								<label>PASSWORD</label> <input class="form-control"
									id="loginPasswd" type="password" placeholder="PASSWORD"
									required
									data-validation-required-message="Please enter your password.">
								<p class="help-block text-danger"></p>
							</div>
						</div>
						<br>
						<div id="success"></div>
						<div class="form-group">
							<button type="submit" class="btn btn-success btn-lg"
								id="sendLoginButton">Send</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="/WEB-INF/views/include/footer.jsp" />
</body>

</html>
