package com.revature.demo2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
