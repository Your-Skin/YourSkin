package com.example.yourskin;

public class Product extends Skincare {
    private String name_skin;
    private String ingredient;
    private String link_picture;
    private String cate_name;
    private int id;
    public Product(String name_skin, String ingredient,String link_picture, String cate_name){
        this.name_skin=name_skin;
        this.ingredient=ingredient;
        this.link_picture=link_picture;
        this.cate_name=cate_name;
    }
    public Product(int id,String name_skin,String link_picture, String cate_name){
        this.id=id;
        this.name_skin=name_skin;
        this.link_picture=link_picture;
        this.cate_name=cate_name;
    }
    public Product(String name_skin,String link_picture, String cate_name){
        this.name_skin=name_skin;
        this.link_picture=link_picture;
        this.cate_name=cate_name;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getNameSkin() {
        return name_skin;
    }

    @Override
    public String getIngredient() {
        return ingredient;
    }

    @Override
    public String getImage() {
        return link_picture;
    }

    @Override
    public String getNameCategory() {
        return cate_name;
    }
}
