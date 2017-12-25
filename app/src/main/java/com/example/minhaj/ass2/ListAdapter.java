package com.example.minhaj.ass2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Minhaj on 10/16/2017.
 */

public class ListAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_list,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).BindDataView(position);
    }

    @Override
    public int getItemCount() {
        return Data.Name.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mItemText ;
        private ImageView mItemImage;

        public ListViewHolder(View itemView){

            super(itemView);
            mItemText= itemView.findViewById(R.id.ItemText);
            mItemImage =itemView.findViewById(R.id.itemImage);
            itemView.setOnClickListener(this);
        }

        public void BindDataView(int position){
            mItemText.setText(Data.Name[position]);
            mItemImage.setImageResource(Data.img[position]);
        }

        public void onClick(View view){

        }
    }
}
