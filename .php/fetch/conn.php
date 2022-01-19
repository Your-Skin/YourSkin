<?php

class DataBaseConfig
{
    public $servername;
    public $id_skin;
    public $name_skin;
    public $ingredient;
    public $id_category;
    public $cate_name;
    public $databasename;


    public function __construct()
    {

        $this->servername = 'localhost';
        $this->id_skin = 'root';
        $this->name_skin = 'root';
        $this->ingredient = 'root';
        $this->id_category = 'root';
        $this->cate_name = 'root';
        $this->databasename = 'myskin';

    }
}

?>