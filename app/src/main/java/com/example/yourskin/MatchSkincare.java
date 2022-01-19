package com.example.yourskin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

public class MatchSkincare extends AppCompatActivity {
    int id_skin;
    RecyclerView recyclerView;
    MatchAdapter matchAdapter;
    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_skincare);
        id_skin = getIntent().getIntExtra("id_skin",0);

        recyclerView = (RecyclerView) findViewById(R.id.recyclermatch);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList = new ArrayList<>();
        loadProducts();

}

    private void loadProducts() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, ListURL.MATCH_URL+id_skin,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONArray products = new JSONArray(response);
                            for(int i=0;i<products.length();i++){
                                JSONObject productObject = products.getJSONObject(i);

                                String name_skin =productObject.getString("name_skin");
                                String link_picture = productObject.getString("link_picture");
                                String cate_name = productObject.getString("cate_name");


                                Product product = new Product(name_skin,link_picture,cate_name);
                                productList.add(product);
                            }

                            matchAdapter = new MatchAdapter(MatchSkincare.this,productList);
                            recyclerView.setAdapter(matchAdapter);

                        }catch (JSONException e){
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MatchSkincare.this,error.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
        Volley.newRequestQueue(this).add(stringRequest);
    }
}