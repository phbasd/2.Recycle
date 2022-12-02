package com.example.and11_allview.recycler_my;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.R;

public class MyRecvAdapter extends RecyclerView.Adapter<MyRecvAdapter.MyViewholder>{
    LayoutInflater inflater;

    public MyRecvAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_my_recycler, parent, false);
        MyViewholder myViewholder = new MyViewholder(v);
        return myViewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder m, int i) {
       /* m.btn_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m.imgmv1.getVisibility() == View.VISIBLE) {
                    m.imgmv1.setVisibility(View.GONE);
                    m.imgmv2.setVisibility(View.VISIBLE);
                }else {
                    m.imgmv2.setVisibility(View.GONE);
                    m.imgmv1.setVisibility(View.VISIBLE);
                }
            }
        });*/
    }

    /* position이 꼬여서 데이터가 맘대로 통제가 안되는 경우
     * RecyclerView 자체의 issue ==> getItemId , getItemViewType 두개를 override 해주기.
     * */
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }
    @Override
    public int getItemCount() {
        return 10;
    }

    public class MyViewholder extends RecyclerView.ViewHolder {
            ImageView imgmv1, imgmv2;
            Button btn_my;
        public MyViewholder(@NonNull View v) {
            super(v);

            imgmv1 = v.findViewById(R.id.imgv1);
            imgmv2 = v.findViewById(R.id.imgv2);
            btn_my = v.findViewById(R.id.btn_my);
        }
    }
}
