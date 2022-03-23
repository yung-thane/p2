package com.revature.demo2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {
    @GetMapping("/artists")
    public List<Artist> getArtists(){
        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist(1, "AC/DC"));
        return artists;
        
    }
    
}
