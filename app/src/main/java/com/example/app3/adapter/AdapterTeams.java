package com.example.app3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app3.R;
import com.example.app3.model.Team;

import java.util.List;

public class AdapterTeams extends RecyclerView.Adapter<AdapterTeams.MyViewHolder> {

    private List<Team> listTeams;

    public AdapterTeams(List<Team> list){
        this.listTeams = list;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name, cityState;
        ImageView img;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.textViewName);
            cityState = view.findViewById(R.id.textViewCityState);
            img = view.findViewById(R.id.imageViewTeam);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_list_teams, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Team obj = listTeams.get(position);
        holder.name.setText(obj.getName());
        holder.cityState.setText(obj.getCityState());
        holder.img.setImageResource(obj.getImg());
    }

    @Override
    public int getItemCount() {
        return listTeams.size();
    }
}
