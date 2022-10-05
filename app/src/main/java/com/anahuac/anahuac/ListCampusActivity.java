package com.anahuac.anahuac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anahuac.anahuac.adapters.ListCampusAdapter;
import com.anahuac.anahuac.models.Campus;

import java.util.ArrayList;

public class ListCampusActivity extends AppCompatActivity {

    private RecyclerView rvCampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_campus);

        rvCampus = findViewById(R.id.rv_campus);
        ArrayList<Campus> listCampus = new ArrayList<>();
        Campus c1 = new Campus(
                "Universidad Anáhuac - Campus Cancun",
                R.drawable.ic_campus_cancun
        );

        Campus c2 = new Campus(
                "Universidad Anáhuac - Campus Mayab",
                R.drawable.ic_campus_mayab
        );
        listCampus.add(c1);
        listCampus.add(c2);

        rvCampus.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        ListCampusAdapter adapter = new ListCampusAdapter(listCampus);
        rvCampus.setAdapter(adapter);
    }
}