package com.example.and11_allview.human;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.R;

//2.
public class HumanAdapter extends RecyclerView.Adapter<HumanAdapter.HumanViewHolder>{
    LayoutInflater inflater;

    public HumanAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    //3.
    @NonNull
    @Override
    public HumanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_humanf_humanv, parent, false);
        HumanViewHolder humanViewHolder = new HumanViewHolder(v);

        return humanViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HumanViewHolder h, int i) {
        h.human_title.setText("사과");
        h.human_txt.setText("맛있는 밀양 얼음골 사과 팝니다.");
        h.human_price.setText("50,000원");
    }

    //4.
    @Override
    public int getItemCount() {
        return 10;
    }

    //1.
    public class HumanViewHolder extends RecyclerView.ViewHolder{
        //5.
        ImageView human_img;
        TextView human_title,human_txt, human_price;
        public HumanViewHolder(@NonNull View v) {
            super(v);
            human_img = v.findViewById(R.id.human_img);
            human_title = v.findViewById(R.id.human_title);
            human_txt = v.findViewById(R.id.human_txt);
            human_price = v.findViewById(R.id.human_price);
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}
