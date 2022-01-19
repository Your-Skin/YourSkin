package com.example.yourskin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterSearch extends RecyclerView.Adapter<AdapterSearch.MyViewHolder> {
    private List<SearchSkincare> skincare;
    private Context context;
    private OnSkincareListener monSkincareListener;

    public AdapterSearch(List<SearchSkincare> skincare, Context context) {
        this.skincare = skincare;
        this.context = context;
//        this.monSkincareListener=onSkincareListener;
    }
    public AdapterSearch(List<SearchSkincare> skincare, OnSkincareListener onSkincareListener){
        this.skincare = skincare;
        this.monSkincareListener=onSkincareListener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listsearch,parent,false);
        return new MyViewHolder(view,monSkincareListener);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText(skincare.get(position).getName_skin());
        holder.cate.setText(skincare.get(position).getCate());
        holder.id.setText(String.valueOf(skincare.get(position).getId()));

    }

    

    @Override
    public int getItemCount() {
        return skincare.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView name,cate,id;
        OnSkincareListener onSkincareListener;
        public MyViewHolder(View itemView,OnSkincareListener onSkincareListener) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            cate=itemView.findViewById(R.id.cate);
            id=itemView.findViewById(R.id.id);
            this.onSkincareListener=onSkincareListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onSkincareListener.onSkincareClick(getAdapterPosition());

        }

    }
    public interface OnSkincareListener{
        void onSkincareClick(int position);
    }
}
