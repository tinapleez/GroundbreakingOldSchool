/*
 * Copyright (c) 2018. Tina Taylor  All Rights Reserved
 */

package com.freecbdhomebiz.groundbreakingoldschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Custom Array list of Songs and Artists and Year
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Rocking the House", "Funky Four Plus One", "1979"));
        songs.add(new Song("Rappers Delight", "Sugarhill Gang", "1979"));
        songs.add(new Song("The Breaks", "Kurtis Blow", "1980"));
        songs.add(new Song("Planet Rock", "Afrika Bambaataa & The Soulsonic Force", "1982"));
        songs.add(new Song("Rockin It", "The Fearless Four", "1982"));

        // Create an {@link SongAdapter}, whose data source is a music_list_view of {@link Song}s.
        SongAdapter adapter = new SongAdapter(this, songs);

        // The {@link ListView} with the view ID of music_list_view is declared in the
        // activity_main.xml file.
        final ListView listView = findViewById(R.id.music_list_view);

        // Make the {@link ListView} use the custom {@link SongAdapter} so that the
        // {@link ListView} will display the ArrayList items {@link Song} in the music_list_view.
        listView.setAdapter(adapter);

        // Create OnItemClickListener and Intent for the listView to open PlayScreen Activity
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long l) {
                Intent i = new Intent(MainActivity.this, PlayScreen.class);
                // Create a Song object to get the current listView ArrayList items
                Song data = (Song) listView.getAdapter().getItem(position);
                // Song.java implements Parcelable so songData will pass over song, artist, year
                i.putExtra("songData", data);
                startActivity(i);
            }
        });
    }
}