<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="wrapper" class="c1">

	<div class="c1" id="random">
		<!--
			 -->
		<div id="imgCon" class="c2">
			<!--
				   -->
			<img src="https://i.ibb.co/Wst1qhq/logo.png" alt="Logo" id="logo"
				class="c1" />
			<!--
			 -->
		</div>
		<!--
			 -->
		<div id="title0" class="c2">
			<!--
				  -->
			<h1>Σύστημα Πρακτικής Άσκησης</h1>
			<!--
			 -->
		</div>
		<!--
			 -->
		<div id="navbar2" class="c2">
			<!--
				  --
			 -->
		</div>
		<!--
		 -->
	</div>
	<!--
		 -->
	<div id="navbar" class="c1">
		<!--
				-->
		<ul id="painN1">

		</ul>
	</div>
</div>
<br>
<br>
<br>
<form action="HelloServlet" method="post" id="loginForm">

	<div class="containerL">
		<label for="uname"><b>Username</b></label> <input type="text"
			placeholder="Enter Username" name="uname" required> <label
			for="psw"><b>Password</b></label> <input type="password"
			placeholder="Enter Password" name="psw" required>

		<button type="submit">Login</button>
		<label> <input type="checkbox" checked="checked"
			name="remember"> Remember me
		</label>
	</div>

	<div class="containerL" style="background-color: #f1f1f1">
		<button type="button" class="cancelbtn">Cancel</button>
		<span class="psw">Forgot <a style="color: blue" href="#">password?</a></span>
	</div>
</form>





<div id="footer">
	<div></div>
	<div class="footerD">
		<br> <br> <br> <br> <br> <br>
	</div>
	<div id="footerL" class="footerD">
		<br>
		<p>Σύστημα Πρακτικής Άσκησης</p>
		<p>
			<i class="fa fa-copyright"></i> Copyright 2019-2020 Κατανεμημένα
			Συστήματα Group32
		</p>
	</div>

</div>


</body>





</html>