package com.example.and11_allview.recycler_my;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and11_allview.R;
import com.example.and11_allview.recycler.RecvAdapter;


public class MyRecyclerFragment extends Fragment {
    RecyclerView recvmy;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_my_recycler, container, false);

        recvmy = v.findViewById(R.id.recv_my);
        recvmy.setAdapter(new MyRecvAdapter(inflater));

        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext() , RecyclerView.VERTICAL , false
        );
        recvmy.setLayoutManager(manager);
        return v;
    }
}