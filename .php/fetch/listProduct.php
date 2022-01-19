<?php
$con= mysqli_connect("localhost","root","","myskin") or die("Error: " . mysqli_error($con));

$skin = $_GET["skin"];
$product=$con->prepare('select id_skin,name_skin,cate_name,link_picture from product left join category on product.id_category=category.id_category where category.id_category='.$skin.'');

$product->execute();
$product->bind_result($id_skin,$name_skin,$cate_name,$link_picture);
$pro=array();
while ($product->fetch()){
    $temp=array();
    $temp['id_skin']=$id_skin;
    $temp['name_skin'] = $name_skin;
    $temp['cate_name'] = $cate_name;
    $temp['link_picture'] = $link_picture;

    array_push($pro,$temp);
}
echo json_encode($pro);

?>