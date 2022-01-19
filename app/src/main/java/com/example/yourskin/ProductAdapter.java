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

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{
    private Context mCtx;
    private List<Product> productList;

    public ProductAdapter(Context mCtx,List<Product> productList) {
        this.mCtx=mCtx;
        this.productList = productList;
    }


    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout,null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.name_skin.setText(product.getNameSkin());
        holder.ingredient.setText(product.getIngredient());
        holder.cate_name.setText(product.getNameCategory());

        Glide.with(mCtx)
                .load(product.getImage())
                .into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView name_skin,ingredient,cate_name;
        ImageView imageView;

            public ProductViewHolder(View itemView) {
                super(itemView);
                name_skin = itemView.findViewById(R.id.name_skin);
                ingredient = itemView.findViewById(R.id.ingredient);
                imageView = itemView.findViewById(R.id.imageView);
                cate_name = itemView.findViewById(R.id.cate_name);


            }
        }

}



