<?php
$con= mysqli_connect("localhost","root","","myskin") or die("Error: " . mysqli_error($con));

if(isset($_GET['key'])){
    $key = $_GET['key'];
    $query = "select id_skin,name_skin,cate_name from product left join category on product.id_category=category.id_category where name_skin like '%$key%'";
    $result = mysqli_query($con,$query);
        $response = array();
        while($row = mysqli_fetch_assoc($result)){
            array_push($response,
            array(
                'id_skin'=>$row['id_skin'],
                'name_skin'=>$row['name_skin'],
//                'ingredient'=>$row['ingredient'],
                'cate_name'=>$row['cate_name']
            ));
        }
        echo json_encode($response);
}else{
    $query = "select id_skin,name_skin,cate_name from product left join category on product.id_category=category.id_category";
        $result = mysqli_query($con,$query);
        $response = array();
        while ($row = mysqli_fetch_assoc($result)){
            array_push($response,
                array(
                    'id_skin'=>$row['id_skin'],
                    'name_skin'=>$row['name_skin'],
//                    'ingredient'=>$row['ingredient'],
                    'cate_name'=>$row['cate_name']
                ));
        }
        echo json_encode($response);
}

mysqli_close($con);
?>
