<?php
$con = mysqli_connect("localhost","root","","myskin");

    $id_skin=$_GET['id_skin'];
	$name_skin=$_GET['name_skin'];
	$ingredient=$_GET['ingredient'];
	$id_category=$_GET['id_category'];
	$link_picture=$_GET['link_picture'];

	$qry = "INSERT INTO product values('$id_skin','$name_skin','$ingredient','$id_category','$link_picture')";
	mysqli_query($con,$qry);
?>