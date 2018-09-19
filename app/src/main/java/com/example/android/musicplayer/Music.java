package com.example.android.musicplayer;

/**
 * Created by USER on 8/17/2018.
 */

public class Music {
    // this for music
    private String mMusicAlbum;
    // this for artist
    private String mArtist;

    // this for Music and Artist store in the "Songs" class.
    public Music(String MusicAlbum, String Artist) {
        mMusicAlbum = MusicAlbum;
        mArtist = Artist;
    }

    // this get song in the list
    public String getMusicAlbum() {
        return mMusicAlbum;
    }

    // this get Artist, in the artist list
    public String getArtist() {
        return mArtist;
    }
}
