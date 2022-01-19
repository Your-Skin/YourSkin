<?php
$con = mysqli_connect("localhost","root","","myskin");
	 
	$id_skin=$_GET['id_skin'];
	 
	$qry = "delete from product where id_skin='$id_skin'";
	mysqli_query($con,$qry);
?>