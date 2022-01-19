package com.example.yourskin;

import com.google.gson.annotations.SerializedName;

public class SearchSkincare {
    @SerializedName("id_skin") private int Id;
    @SerializedName("name_skin") private String Name_skin;
    @SerializedName("cate_name") private String Cate;

//    public SearchSkincare(int id, String name_skin, String cate) {
//        this.id = id;
//        this.name_skin = name_skin;
//        this.cate = cate;
//    }

    public int getId() {
        return Id;
    }

    public String getName_skin() {
        return Name_skin;
    }

    public String getCate() {
        return Cate;
    }
}
