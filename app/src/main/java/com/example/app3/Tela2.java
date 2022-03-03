package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        TextView nameOut = findViewById(R.id.textViewNameOutput);
        TextView cityOut = findViewById(R.id.textViewCityOutput);
        ImageView img = findViewById(R.id.imageViewTeamOutput);
        TextView title = findViewById(R.id.textViewTitle);

        Intent it = getIntent();
        if(it != null){
            Bundle params = it.getExtras();
            if(params != null){
                String name = params.getString("name");
                String city = params.getString("city");

                switch (name) {
                    case "FC Bayern":
                        nameOut.setText(name);
                        cityOut.setText(city);
                        img.setImageResource(R.drawable.bayern);
                        title.setText("Campeão Bundesleague 2021");
                        break;
                    case "Corinthians":
                        nameOut.setText(name);
                        cityOut.setText(city);
                        img.setImageResource(R.drawable.corinthians);
                        title.setText("Campeão Mundial 2012");
                        break;
                    case "Real Madrid":
                        nameOut.setText(name);
                        cityOut.setText(city);
                        img.setImageResource(R.drawable.real);
                        title.setText("Campeão Champions League 2017/18");
                        break;
                    case "Palmeiras":
                        nameOut.setText(name);
                        cityOut.setText(city);
                        img.setImageResource(R.drawable.palmeiras);
                        title.setText("Campeão Libertadores 2021");
                        break;
                }
            }
        }
    }
}