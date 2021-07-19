package com.example.instagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SubscriberAdapter extends RecyclerView.Adapter<SubscriberAdapter.SubscriberViewHolder> {

    Post[] posts;

    public SubscriberAdapter(Post[] posts){
        this.posts = posts;

    }


    @Override
    public SubscriberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_insta, parent, false);
         SubscriberViewHolder viewHolder = new SubscriberViewHolder(view);
         return viewHolder;
    }

    @Override
    public void onBindViewHolder(SubscriberAdapter.SubscriberViewHolder holder, int position) {
        holder.textView.setText(posts[position].name);

    }

    @Override
    public int getItemCount() {
        return posts.length;
    }

    class SubscriberViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public SubscriberViewHolder(View view){
            super(view);
        }

    }
}
