package com.example.instagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SubscriberAdapter extends RecyclerView.Adapter<SubscriberAdapter.SubscriberViewHolder> {



    @Override
    public SubscriberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_insta, parent, false);
         SubscriberViewHolder viewHolder = new SubscriberViewHolder(view);
         return viewHolder;
    }

    @Override
    public void onBindViewHolder(SubscriberAdapter.SubscriberViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class SubscriberViewHolder extends RecyclerView.ViewHolder {
        public SubscriberViewHolder(View view){
            super(view);
        }

    }
}
