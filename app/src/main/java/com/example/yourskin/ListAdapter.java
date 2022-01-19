package com.example.yourskin;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.yourskin.Product;
import com.example.yourskin.R;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<com.example.yourskin.ListAdapter.ListViewHolder>{
    private Context mCtx;
    private List<Product> productList;
    private OnSkincareListener onSkincareListener;

    public ListAdapter(Context mCtx,List<Product> productList) {
        this.mCtx=mCtx;
        this.productList = productList;
    }
    public ListAdapter(List<Product> productList,OnSkincareListener onSkincareListener){
        this.productList=productList;
        this.onSkincareListener=onSkincareListener;
    }
    public ListAdapter(Context mCtx,List<Product> productList,OnSkincareListener onSkincareListener) {
        this.mCtx=mCtx;
        this.productList = productList;
        this.onSkincareListener=onSkincareListener;
    }


    @Override
    public com.example.yourskin.ListAdapter.ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_cate,null);
        return new com.example.yourskin.ListAdapter.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(com.example.yourskin.ListAdapter.ListViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.id_skin.setText(String.valueOf(product.getID()));
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

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView name_skin,cate_name,id_skin;
        ImageView imageView;

        public ListViewHolder(View itemView) {
            super(itemView);
            name_skin = itemView.findViewById(R.id.name_skin);
            imageView = itemView.findViewById(R.id.imageView);
            cate_name = itemView.findViewById(R.id.cate_name);
            id_skin=itemView.findViewById(R.id.id_skin);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(onSkincareListener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            onSkincareListener.onSkincareClick(position);
                        }
                    }
                }
            });
        }

    }
    public void setOnSkincareListener(OnSkincareListener skincareListener){
        onSkincareListener=skincareListener;
    }
    public interface OnSkincareListener{
        void onSkincareClick(int position);

    }

}



