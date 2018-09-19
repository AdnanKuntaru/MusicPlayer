
package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // this an arraylist that hold music album and Artist of the songs
        ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Afra album", "Nura M Inuwa"));
        musics.add(new Music("Rike Gwaninka", "Adamu Hassan"));
        musics.add(new Music("Story song", "P Square"));
        musics.add(new Music("One day in your life", "Michael Jackson"));
        musics.add(new Music("Remember the Time", "Michael Jackson"));
        musics.add(new Music("02 Baqara", "Gamidi"));
        musics.add(new Music("01 fatiha", "Sudais"));
        musics.add(new Music("Nass", "Nura M Inuwa"));
        musics.add(new Music("Love me", "Justing Bieber"));
        musics.add(new Music("113 falaq", "sudais"));
        musics.add(new Music("Yunus", "sudais"));

        musicAdapter adapter = new musicAdapter(this, musics);
        // this present the data in the list series
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Songs.this.startActivity(new Intent(Songs.this, NowPlaying.class));

            }
        });
        // This produce up button.
        getSupportActionBar().setTitle("Songs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

