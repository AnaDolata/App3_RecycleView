package com.example.app3.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.app3.R;
import com.example.app3.Tela2;
import com.example.app3.adapter.AdapterTeams;
import com.example.app3.model.Team;
import com.example.app3.adapter.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewTeams;
    private List<Team> listTeams = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewTeams = findViewById(R.id.recyclerViewTeams);
        
        this.createTeam();
        AdapterTeams adapter = new AdapterTeams(listTeams);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewTeams.setLayoutManager(layoutManager);
        recyclerViewTeams.setHasFixedSize(true);
        recyclerViewTeams.setAdapter(adapter);

        Intent it = new Intent(this, Tela2.class);

        recyclerViewTeams.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerViewTeams,
                        new RecyclerItemClickListener.OnItemClickListener(){
                            @Override
                            public void onItemClick(View view, int position) {
                                Team obj = listTeams.get(position);
                                Bundle params = new Bundle();
                                params.putString("name", obj.getName());
                                params.putString("city", obj.getCityState());
                                it.putExtras(params);
                                startActivity(it);
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {

                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )
        );
    }

    private void createTeam() {
        Team obj = new Team(R.drawable.bayern, "FC Bayern", "Munique - Baviera");
        listTeams.add(obj);
        obj = new Team(R.drawable.corinthians, "Corinthians", "São Paulo - São Paulo");
        listTeams.add(obj);
        obj = new Team(R.drawable.real, "Real Madrid", "Madrid - Espanha");
        listTeams.add(obj);
        obj = new Team(R.drawable.palmeiras, "Palmeiras", "São Paulo - São Paulo");
        listTeams.add(obj);
    }

    public void onClick(Team obj){
        Intent it = new Intent(this, Tela2.class);
        Bundle params = new Bundle();
        params.putString("name", obj.getName());
        params.putString("city", obj.getCityState());
        it.putExtras(params);
        startActivity(it);
    }
}