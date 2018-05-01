/*
 * Copyright (c) 2018. Tina Taylor  All Rights Reserved
 */

package com.freecbdhomebiz.groundbreakingoldschool;

/**
 * Created by linuser1 on 5/1/18.
 */

public class Song {

    /** Song */
    private String mSong;

    /** Artist */
    private String mArtist;
    
    /** Year */
    private String mYear;


    /**
     * Create a new com.freecbdhomebiz.groundbreakingoldschool.Song object.
     *
     * @param song is the Song
     * @param artist is the Artist/Band
     * @param year is the year the song was released
     *
     */
    public Song(String song, String artist, String year) {
        mSong = song;
        mArtist = artist;
        mYear = year;
    }

    /**
     * Get the song.
     */
    public String getSong() {
        return mSong;
    }

    /**
     * Get the artist/band.
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the year released.
     */
    public String getYear() {
        return mYear;
    }
}
