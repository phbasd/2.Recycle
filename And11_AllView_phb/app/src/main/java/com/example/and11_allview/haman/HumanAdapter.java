package com.example.and11_allview.haman;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//2.
public class HumanAdapter extends RecyclerView.Adapter<HumanAdapter.HumanViewHolder>{
    LayoutInflater inflater;
    public HumanAdapter(LayoutInflater inflater) {this.inflater = inflater;}

    @NonNull
    @Override
    public HumanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HumanViewHolder h, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    //1.
    public class HumanViewHolder extends RecyclerView.ViewHolder{
        public HumanViewHolder(@NonNull View v) {
            super(v);
        }
    }
}
