package com.revature.demo2;

public class Artist {
    private int artist_id;
    private String name;

    public Artist(int artist_id, String name) {
        this.artist_id = artist_id;
        this.name = name;
    }
    public int getArtist_id() {
        return artist_id;
    }
    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
}
