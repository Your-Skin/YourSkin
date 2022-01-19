package com.example.yourskin;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("search.php")
    Call <List<SearchSkincare>> search (@Query("key") String key);
}
