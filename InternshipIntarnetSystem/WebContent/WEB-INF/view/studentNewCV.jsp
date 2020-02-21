<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="wrapper" class="c1">
			
			<div class="c1" id="random"><!--
			 --><div id="imgCon" class="c2"><!--
				   --><img src="https://e-studies.hua.gr/unistudent/res/logo.png" alt="Logo" id="logo" class="c1"/><!--
			 --></div><!--
			 --><div id="title1" class="c2"><!--
				  --><h1>Εσωτερικό Σύστημα Πρακτικής Άσκησης</h1><!--
			 --></div><!--
			 --><div id="navbar2" class="c2"><!--
				  --><ul>
					  <li><a href="#contact" class="nb2" ><i class="fa fa-fw fa-envelope"></i> Επικοινωνία</a></li>
					  <li><a href="#manual" class="nb2"><i class="fa fa-book"></i> Οδηγίες Χρήσης</a></li>
					  <li><a href="#logOut" class="nb2"><i class="fa fa-fw fa-user"></i> Log Out</a></li> 
					 </ul><!--
			 --></div><!--
		 --></div><!--
		 --><div id="navbar" class="c1"><!--
				--><ul>
				  <li><a class="active" href="student"><i class="fa fa-fw fa-home"></i> Home</a></li>
				  <li><a href="student/criteria"><i class="fa fa-list-ol"></i> Κριτήρια</a></li>
				  <li><div class="dropdown">
					<button class="dropbtn"><i class="fa fa-list-alt"></i> Δηλώσεις 
					  <i class="fa fa-caret-down"></i>
					</button>
					<div class="dropdown-content">
					  <a href="student/singup">Δήλωση Ενδιαφέροντος</a>
					  <a href="student/cv">Δήλωση Βιογραφικού</a>
					  <a href="student/viewinterships">Δήλωση Πρακτικής</a>
					</div>
  </div> 
				  <li><a href="student/news"><i class="fa fa-bell"></i> Ανακοινώσεις</a></li> 
				</ul>
			</div>
		</div>
		
		<div>
			<h2>Δήλωση Βιογραφικού</h2>
			<p class="textp">Συμπληρώστε την παρακάτω φόρμα με τα στοιχεία του βιογραφικού σας.<br>Όλα τα πεδία είναι υποχρεοτικά. </p>
		</div>
		
		<form action="/action_page.php" method="post" style="background-color: white">
			
			<div class="containerS">
				<i class="fa fa-id-card-o"></i> <b>Last Name:</b><br>
				<input type="text" placeholder="Last Name" name="lName" required><br><br>
				<i class="fa fa-id-card-o"></i> <b>First Name:</b><br>
				<input type="text" placeholder="First Name" name="fName" required><br><br>
				<i class="fa fa-id-card-o"></i> <b>Birth Date:</b><br>
				<input type="text" placeholder="xx/xx/xxxx" name="bday" required><br><br>
				<i class="fa fa-envelope"></i> <b>Email:</b><br>
				<input type="text" placeholder="Example@example.example" name="email" required><br><br>
				<i class="fa fa-phone"></i> <b>Phone Number</b><br>
				<input type="text" placeholder="1234567890" name="phone" required><br><br>
				<i class="fa fa-fw fa-home"></i> <b>Address:</b><br>
				<input type="text" placeholder="City, Area, Street Name & Number, ZIP Code" name="address" required><br><br>
				<i class="fa fa-edit"></i> <b> Description:</b><br>
				<textarea name="desc" rows="10" cols="30" placeholder="Enter a description of your skills..." required></textarea><br><br>
					
		
				<button type="submit">Submit <i class="fa fa-check"></i></button>
			</div>
		</form>
		
		
		
		
		<div id="footer">
			<div>
			
			</div>
			<div class="footerD">
				<br>
				<a href="#home" class="nb2"><i class="fa fa-caret-right"></i> Home <i class="fa fa-fw fa-home"></i></a><br>
				<a href="#news" class="nb2"><i class="fa fa-caret-right" ></i> Σχετικοί Σύνδεσμοι <i class="fa fa-link"></i></a><br>
				<a href="#contact" class="nb2"><i class="fa fa-caret-right"></i> Όροι Χρήσης <i class="fa fa-asterisk"></i></a><br>
				<a href="#contact" class="nb2" ><i class="fa fa-caret-right"></i> Επικοινωνία <i class="fa fa-fw fa-envelope"></i></a><br>
				<a href="#manual" class="nb2"><i class="fa fa-caret-right"></i> Οδηγίες Χρήσης <i class="fa fa-book"></i></a><br>
			</div>
			<div id="footerL" class="footerD"> 
				<br>
				<p>Σύστημα Πρακτικής Άσκησης - Σύστημα Εξυπηρέτησης Φοιτητών</p>
				<p><i class="fa fa-copyright"></i> Copyright 2019-2020 Κατανεμημένα Συστήματα Group32 </p>
			</div>
			
		</div>


	</body>





</html>