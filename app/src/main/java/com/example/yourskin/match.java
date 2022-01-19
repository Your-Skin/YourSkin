package com.example.yourskin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.List;

import cleanser.cleanser;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class match extends AppCompatActivity implements AdapterSearch.OnSkincareListener {
    private static final String TAG = "MatchSkincare";
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<SearchSkincare> searchSkincares;
    private AdapterSearch adapterSearch;
    private ApiInterface apiInterface;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        Toolbar toolbar = findViewById(R.id.bar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        progressBar = findViewById(R.id.progress);
        recyclerView = findViewById(R.id.recycler);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

//        adapterSearch = new AdapterSearch(searchSkincares, (AdapterSearch.OnSkincareListener) this);
//        recyclerView.setAdapter(adapterSearch);

        fetchSkin("");
//        Log.i("info",searchSkincares.get(0)+"");
    }
    public void fetchSkin(String key){
        apiInterface = ApiSkincare.getApiSkincare().create(ApiInterface.class);
        Call<List<SearchSkincare>> call = apiInterface.search(key);

        call.enqueue(new Callback<List<SearchSkincare>>() {
            @Override
            public void onResponse(Call<List<SearchSkincare>> call, Response<List<SearchSkincare>> response) {
                progressBar.setVisibility(View.GONE);
                searchSkincares = response.body();
                adapterSearch  = new AdapterSearch(searchSkincares, (Context) match.this);
                recyclerView.setAdapter(adapterSearch);
                adapterSearch.notifyDataSetChanged();
                RecyclerView();
            }

            @Override
            public void onFailure(Call<List<SearchSkincare>> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(match.this,"Error :"+t.toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search,menu);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName())
        );
        searchView.setIconifiedByDefault(false);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                fetchSkin(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                fetchSkin(newText);
                return false;
            }
        });
        return true;
    }

    private void RecyclerView(){
        adapterSearch = new AdapterSearch(searchSkincares, (AdapterSearch.OnSkincareListener) this);
        recyclerView.setAdapter(adapterSearch);
    }

    @Override
    public void onSkincareClick(int position) {
        Log.d(TAG,"onSkincareClick: clicked"+position);
        Intent intent = new Intent(this,MatchSkincare.class);
        SearchSkincare searchSkincare = searchSkincares.get(position);
        intent.putExtra("id_skin",searchSkincare.getId());
        startActivity(intent);
    }


}