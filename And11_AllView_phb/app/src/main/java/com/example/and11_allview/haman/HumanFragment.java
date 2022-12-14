package com.example.and11_allview.haman;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and11_allview.R;

public class HumanFragment extends Fragment {
    RecyclerView rcyv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_human, container, false);

        rcyv = v.findViewById(R.id.recv_human);
        rcyv.setAdapter(new HumanAdapter(inflater));

        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext(), RecyclerView.VERTICAL, false
        );

        rcyv.setLayoutManager(manager);


        return v;
    }
}