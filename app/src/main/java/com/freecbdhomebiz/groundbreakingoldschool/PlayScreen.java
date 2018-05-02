/*
 * Copyright (c) 2018. Tina Taylor  All Rights Reserved
 */

package com.freecbdhomebiz.groundbreakingoldschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class PlayScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);

        TextView artistPlay = findViewById(R.id.text_artist_play_screen);
        TextView songPlay = findViewById(R.id.text_song_play_screen);

        // Song.java implements Parcelable
        // Create a Song.java object to hold passed over listView data from MainActivity
        Song ps = getIntent().getParcelableExtra("songData");

        String a = ps.getArtist(); // getArtist method defined in Song.java
        String b = ps.getSong(); // getSong method defined in Song.java

        artistPlay.setText(a);
        songPlay.setText(b);


        final Button backButton = findViewById(R.id.button_playscreen_back);
        backButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intentb = new Intent(PlayScreen.this, MainActivity.class);
                startActivity(intentb);
            }
        });
    }
}
