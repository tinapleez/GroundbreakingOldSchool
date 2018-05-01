/*
 * Copyright (c) 2018. Tina Taylor  All Rights Reserved
 */

package com.freecbdhomebiz.groundbreakingoldschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Custom Array list of Songs and Artists and Year
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Funky Four Plus One", "Rocking the House", "1979"));
        songs.add(new Song("Sugarhill Gang", "Rappers Delight", "1979"));
        songs.add(new Song("Kurtis Blow", "The Breaks", "1980"));
        songs.add(new Song("Afrika Bambaataa & The Soulsonic Force", "Planet Rock", "1982"));
        songs.add(new Song("The Fearless Four", "Rockin It", "1982"));


        // Create an {@link SongAdapter}, whose data source is a music_list_view of {@link Song}s.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called music_list_view, which is declared in the
        // activity_main.xml file.
        ListView listView = findViewById(R.id.music_list_view);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display music_list_view items for each {@link Song} in the music_list_view.
        listView.setAdapter(adapter);
    }
}
