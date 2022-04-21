package com.example.retrofitapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.Viewholder> {

    MainActivity mainActivity;
    ArrayList<FakePosts> listpost;

    public PostAdapter(MainActivity mainActivity, ArrayList<FakePosts> listpost) {
        this.mainActivity = mainActivity;
        this.listpost = listpost;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mainActivity).inflate(R.layout.post_item,parent,false);

        Viewholder vv= new Viewholder(view);

        return vv;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        FakePosts fakePosts = listpost.get(position);

        int eid = fakePosts.getId();
        String etitle = fakePosts.getTitle();
        String ebody = fakePosts.getBody();

        holder.no.setText("Post : "+eid);
        holder.title.setText("Title : "+etitle);
        holder.body.setText("Body : "+ebody);



    }

    @Override
    public int getItemCount() {
        return listpost.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        TextView no,title,body;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            no=itemView.findViewById(R.id.no);
            title=itemView.findViewById(R.id.title);
            body=itemView.findViewById(R.id.body);

        }
    }
}
