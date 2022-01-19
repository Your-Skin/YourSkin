package com.example.yourskin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

public class ListProduct extends AppCompatActivity implements ListAdapter.OnSkincareListener {
    private static final String TAG = "ListProduct";
    RecyclerView recyclerView;
    ListAdapter adapter;
    List<Product> productList;
    String id_category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);
        id_category = getIntent().getStringExtra("id_category");

        recyclerView = (RecyclerView) findViewById(R.id.recycler2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList = new ArrayList<>();
        loadProducts();
    }

    private void loadProducts() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, ListURL.LIST_URL+id_category,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONArray products = new JSONArray(response);
                            for(int i=0;i<products.length();i++){
                                JSONObject productObject = products.getJSONObject(i);

                                int id=productObject.getInt("id_skin");
                                String name_skin =productObject.getString("name_skin");
//                                String ingredient = productObject.getString("ingredient");
                                String link_picture = productObject.getString("link_picture");
                                String cate_name = productObject.getString("cate_name");

                                Product product = new Product(id,name_skin,link_picture,cate_name);
                                productList.add(product);

                            }
                            adapter = new ListAdapter(ListProduct.this,productList);
                            recyclerView.setAdapter(adapter);
                            adapter.setOnSkincareListener(ListProduct.this);

                        }catch (JSONException e){
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ListProduct.this,error.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
        Volley.newRequestQueue(this).add(stringRequest);
    }
//    private void RecyclerView(){
//        adapter = new ListAdapter(productList, (ListAdapter.OnSkincareListener) this);
//        recyclerView.setAdapter(adapter);
//    }

    @Override
    public void onSkincareClick(int position) {
        Log.d(TAG,"onSkincareClick: clicked"+ position);
        Intent intent = new Intent(this,fetchProductList.class);
        Product product = productList.get(position);
        intent.putExtra("name_skin",product.getID());
        startActivity(intent);
    }
}