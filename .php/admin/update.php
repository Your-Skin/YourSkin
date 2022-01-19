<?php
$con = mysqli_connect("localhost","root","","myskin");
	 
$name_skin=$_GET['name_skin'];
$ingredient=$_GET['ingredient'];
$id_category=$_GET['id_category'];
$link_picture=$_GET['link_picture'];

	$qry = "update product set ingredient='$ingredient',id_category='$id_category',link_picture='$link_picture' where name_skin='$name_skin'";
	mysqli_query($con,$qry);
?>