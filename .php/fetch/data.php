<?php
require "conn.php";

class DataBase
{
    public $connect;
    public $data;
    private $sql;
    protected $servername;
    protected $id_skin;
    protected $name_skin;
    protected $ingredient;
    protected $id_category;
    protected $cate_name;
    protected $databasename;

    public function __construct()
    {
        $this->connect = null;
        $this->data = null;
        $this->sql = null;
        $dbc = new conn();
        $this->servername = $dbc->servername;
        $this->id_skin = $dbc->id_skin;
        $this->name_skin = $dbc->name_skin;
        $this->ingredient = $dbc->ingredient;
        $this->id_category = $dbc->id_category;
        $this->cate_name = $dbc->cate_name;
        $this->databasename = $dbc->databasename;

    }

    function dbConnect()
    {
        $this->connect = mysqli_connect($this->servername, $this->id_skin, $this->name_skin, $this->ingredient, $this->id_category,
            $this->cate_name, $this->databasename);
        return $this->connect;
    }

    function prepareData($data)
    {
        return mysqli_real_escape_string($this->connect, stripslashes(htmlspecialchars($data)));
    }

    function logIn($id_skin,$name_skin,$ingredient,$id_category,$cate_name)
    {
        $id_skin = $this->prepareData($id_skin);
        $name_skin = $this->prepareData($name_skin);
        $ingredient=$this->prepareData($ingredient);
        $id_category=$this->prepareData($id_category);
        $cate_name=$this->prepareData($cate_name);
        $this->sql = "select name_skin,ingredient,cate_name from product left join category on product.id_category=category.id_category where id_skin='$id_skin'";
        $result = mysqli_query($this->connect, $this->sql);
        $result->execute();
        $result->bind_result($name_skin,$ingredient,$cate_name);
        $product=array();
        while ($result->fetch()){
            $temp=array();
            $temp['name_skin'] = $name_skin;
            $temp['ingredient'] = $ingredient;
            $temp['cate_name'] = $cate_name;

            array_push($product,$temp);
        }
        echo json_encode($product);
//        $row = mysqli_fetch_assoc($result);
//        if (mysqli_num_rows($result) != 0) {
//            $dbusername = $row['username'];
//            $dbpassword = $row['password'];
//            $login = true;
//        } else $login = false;
//
//        return $login;
//    }

    }
}

?>
