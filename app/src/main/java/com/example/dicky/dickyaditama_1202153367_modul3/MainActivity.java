package com.example.dicky.dickyaditama_1202153367_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Minuman> minumanList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Sample2");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new RecyclerViewAdapter(minumanList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        dataMinuman();
    }

    public void dataMinuman(){
        Minuman menu = new Minuman(R.drawable.aqua, "Aqua", "Ini Adalah Air Minum Merk Aqua", "INI AQUA");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.pristine, "Pristine", "Ini Adalah Air Minum Merk Pristine", "INI PRISTINE");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.leminerale, "Leminerale", "Ini Adalah Air Minum Merk Leminerale", "INI Le Minerale");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.cleo, "Cleo", "Ini Adalah Air Minum Merk Cleo", "INI Cleo");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.club, "Club", "Ini Adalah Air Minum Merk Club", "INI Club");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.vit, "Vit", "Ini Adalah Air Minum Merk Vit", "INI VIT");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.ades, "Ades", "Ini Adalah Air Minum Merk Ades", "INI AdeS");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.nestle, "Nestle", "Ini Adalah Air Minum Merk Nestle", "INI Nestlé");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.amidis, "Amidis", "Ini Adalah Air Minum Merk Amidis", "INI AMIDIS");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.equil, "Equil", "Ini Adalah Air Minum Merk Equil", "INI EQUIL");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.evian, "Evian", "Ini Adalah Air Minum Merk Evian", "INI Evian");
        minumanList.add(menu);
        mAdapter.notifyDataSetChanged();
    }
}