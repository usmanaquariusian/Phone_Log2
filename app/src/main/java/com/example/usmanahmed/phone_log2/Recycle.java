package com.example.usmanahmed.phone_log2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import android.view.LayoutInflater;

import com.squareup.picasso.Picasso;

/**
 * Created by Usman Ahmed on 17/10/2017.
 */

public class Recycle extends RecyclerView.Adapter<Recycle.ViewHolder>
{
    View view;
    private List<Contact> list;
    static int count=1;
    Context context;
    public Recycle(List<Contact> list, Context context)
    {
        this.list=list;this.context=context;
    }
    public  class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,name1;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.listimg);
            name= (TextView) itemView.findViewById(R.id.txtview1);
            name1=(TextView) itemView.findViewById(R.id.txtview2);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Contact contact=list.get(position);
            holder.name.setText(contact.getName());
            holder.name1.setText(contact.getId());
        Picasso.with(context).load("https://www.gstatic.com/webp/gallery3/"+count+".sm.png").resize(150,150).centerCrop().into(holder.imageView);
        count++;
        if(count>5)
        {
            count=1;
        }
    }

    @Override
    public int getItemCount()
    {
        int size=list.size();
        return size;
    }


}
