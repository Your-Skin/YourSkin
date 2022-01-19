<?php
$con= mysqli_connect("localhost","root","","myskin") or die("Error: " . mysqli_error($con));

$skin = $_GET["skin"];
$lowph=$con->prepare('select name_skin,ingredient,link_picture,cate_name from product left join category on product.id_category=category.id_category where product.name_skin='.$skin.'');
$lowph->execute();
$lowph->bind_result($name_skin,$ingredient,$link_picture,$cate_name);
$product=array();
while ($lowph->fetch()){
    $temp=array();
    $temp['name_skin'] = $name_skin;
    $temp['ingredient'] = $ingredient;
    $temp['link_picture']=$link_picture;
    $temp['cate_name'] = $cate_name;

    array_push($product,$temp);
}
echo json_encode($product);

?>