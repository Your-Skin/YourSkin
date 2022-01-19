package com.example.yourskin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cleanser.fetchData;

public class fetchProductList extends AppCompatActivity {
    RecyclerView recyclerView;
    ProductAdapter adapter;
    List<Product> productList;
    int name_skin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_product_list);
        name_skin = getIntent().getIntExtra("name_skin",0);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerlist);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList = new ArrayList<>();
        loadProducts();

    }

    private void loadProducts() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, ListURL.FETCH_URL+name_skin,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONArray products = new JSONArray(response);
                            for(int i=0;i<products.length();i++){
                                JSONObject productObject = products.getJSONObject(i);

                                String name_skin =productObject.getString("name_skin");
                                String ingredient = productObject.getString("ingredient");
                                String link_picture = productObject.getString("link_picture");
                                String cate_name = productObject.getString("cate_name");


                                Product product = new Product(name_skin,ingredient,link_picture,cate_name);
                                productList.add(product);
                            }

                            adapter = new ProductAdapter(fetchProductList.this,productList);
                            recyclerView.setAdapter(adapter);

                        }catch (JSONException e){
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(fetchProductList.this,error.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
        Volley.newRequestQueue(this).add(stringRequest);
    }
}