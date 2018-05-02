/*
 * Copyright (c) 2018. Tina Taylor  All Rights Reserved
 */

package com.freecbdhomebiz.groundbreakingoldschool;

import android.os.Parcel;
import android.os.Parcelable;

public class Song implements Parcelable {

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        public Song[] newArray(int size) {
            return new Song[size];
        }
    };
    /**
     * Song
     */
    private String mSong;
    /**
     * Artist
     */
    private String mArtist;
    /**
     * Year
     */
    private String mYear;

    /**
     * Create a new com.freecbdhomebiz.groundbreakingoldschool.Song object.
     *
     * @param song   is the Song
     * @param artist is the Artist/Band
     * @param year   is the year the song was released
     */
    public Song(String song, String artist, String year) {
        mSong = song;
        mArtist = artist;
        mYear = year;
    }

    /**
     * Parceable code copied and modified from: https://stackoverflow.com/a/7181792/9237858
     *
     * @param in
     */
    public Song(Parcel in) {
        String[] data = new String[3];

        in.readStringArray(data);
        // the order needs to be the same as in writeToParcel() method
        mSong = data[0];
        mArtist = data[1];
        mYear = data[2];
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

    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[]{mSong, mArtist, mYear});
    }
}
