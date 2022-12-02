package com.example.and11_allview.human;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and11_allview.R;
import com.example.and11_allview.myrecycler.MyRecvAdapter;

public class HumanFragment extends Fragment {
    RecyclerView recv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_human, container, false);

        return v;
    }
}