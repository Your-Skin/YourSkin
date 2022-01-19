<?php
$con= mysqli_connect("localhost","root","","myskin") or die("Error: " . mysqli_error($con));

$skin = $_GET["skin"];
$lowph=$con->prepare('select match_ingredient from matchskin where matchskin.id_skin='.$skin.'');
$lowph->execute();
$lowph->bind_result($match_ingredient);
$product=array();
while ($lowph->fetch()){
    $temp=array();
    $temp['match_ingredient'] = $match_ingredient;

    array_push($product,$temp);
}
//echo json_encode($match_ingredient);

$m = "AHA";
$a = "BHA";
$t = "Retinol";
$c = "Niacinamide";
$h = "Squalane";

$null= null;
//
//$m = 'AHA';
//$a = 'BHA';
//$t = 'Retinol';
//$c = 'Niacinamide';
//$h = 'Squalane';
//
//$null="";
//
////switch ($product){
////    case 'AHA':
////        $in='BHA';
////        break;
////    case 'BHA':
////        $in='AHA';
////        break;
////    case 'Retinol':
////        $in='Squalane';
////        break;
////    case 'Niacinamide':
////        echo json_encode("Naicinamide can match with every skincare's ingredients");
////        break;
////    case 'Squalane':
////        $in='Retinol';
////        break;
////    default:
////        echo json_encode("This product is not Active skincare's ingredients you can match every skincare");
////        break;
////
////}
//
//
//if($match_ingredient===$m){
//    $in='BHA';
//}
//elseif ($match_ingredient===$a){
//    $in='AHA';
//}
//elseif ($match_ingredient===$t){
//    $in='Squalane';
//}
//elseif ($match_ingredient===$c){
//    echo json_encode("Naicinamide can match with every skincare's ingredients");
//}
//elseif ($match_ingredient===$h){
//    $in='Retinol';
//}
//elseif ($match_ingredient===$null){
//    echo json_encode("This product is not Active skincare's ingredients you can match every skincare");
//}

if(strcmp($match_ingredient,$m) == 0){
    $in='BHA';
}
elseif (strcmp($match_ingredient,$a) == 0){
    $in='AHA';
}
elseif (strcmp($match_ingredient,$t) == 0){
    $in='Squalane';
}
elseif (strcmp($match_ingredient,$c) == 0){
    $in='AHA';
}
elseif (strcmp($match_ingredient,$h) == 0){
    $in='Retinol';
}
elseif (strcmp($match_ingredient,$null) == 0){
    $in='Niacinamide';
}
$pro2=$con->prepare("select name_skin,cate_name,link_picture from product left join category on (product.id_category=category.id_category) left join 
matchskin on (product.id_skin = matchskin.id_skin) where matchskin.match_ingredient like '$in'");
$pro2->execute();
$pro2->bind_result($name_skin,$cate_name,$link_picture);
$product2=array();
while ($pro2->fetch()){
    $temp=array();
    $temp['name_skin'] = $name_skin;
    $temp['cate_name'] = $cate_name;
//    $temp['match_ingredient'] = $match_ingredient;
//    $temp['ingredient2'] = $ingredient;
    $temp['link_picture']=$link_picture;


    array_push($product2,$temp);
}
echo json_encode($product2);

?>
