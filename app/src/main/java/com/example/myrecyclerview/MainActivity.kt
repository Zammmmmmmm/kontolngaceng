package com.example.myrecyclerview

import ListHeroAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private RecyclerView rvHeroes;
    @Override
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll (HeroesData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvHeroes.setLayoutManager(new
        LinearLayoutManager(this));
             ListHeroAdapter ListHeroAdapter = new
         ListHeroAdapter(list);
        rvHeroes.setAdapter(listHeroAdapter);
    }
}