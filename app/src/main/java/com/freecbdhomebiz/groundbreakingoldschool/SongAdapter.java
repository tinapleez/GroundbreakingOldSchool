/*
 * Copyright (c) 2018. Tina Taylor  All Rights Reserved
 */

package com.freecbdhomebiz.groundbreakingoldschool;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by linuser1 on 5/1/18.
 */

public class SongAdapter extends ArrayAdapter {

    public SongAdapter(Context context, ArrayList pSongs) {
        super(context, 0, pSongs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_list, parent, false);
        }
        Song currentsong = (Song) getItem(position);

        TextView songView = (TextView) listItemView.findViewById(R.id.text_main_song);
        songView.setText(currentsong.getSong());

        TextView artistView = (TextView) listItemView.findViewById(R.id.text_main_artist);
        artistView.setText(currentsong.getArtist());

        TextView yearView = (TextView) listItemView.findViewById(R.id.text_main_year);
        yearView.setText(currentsong.getYear());

        return listItemView;
    }
}