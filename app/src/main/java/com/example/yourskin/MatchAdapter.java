package com.example.yourskin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.MatchViewHolder> {
    private Context mCtx;
    private List<Product> productList;

    public MatchAdapter(Context mCtx,List<Product> productList) {
        this.mCtx=mCtx;
        this.productList = productList;
    }

    @Override
    public MatchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_match,null);
        return new MatchAdapter.MatchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MatchAdapter.MatchViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.name_skin.setText(product.getNameSkin());
        holder.cate_name.setText(product.getNameCategory());

        Glide.with(mCtx)
                .load(product.getImage())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class MatchViewHolder extends RecyclerView.ViewHolder {
        TextView name_skin,cate_name;
        ImageView imageView;

        public MatchViewHolder(View itemView) {
            super(itemView);
            name_skin = itemView.findViewById(R.id.name_match);
            imageView = itemView.findViewById(R.id.imagematch);
            cate_name = itemView.findViewById(R.id.cate_match);


        }
    }
}
