package pl.akalkowski.demo.model;

import org.springframework.stereotype.Component;

/**
 * Created by monik on 04.11.2017.
 */
@Component
public class Gif {
    public Long id;
    public String name;
    public boolean favorite;


    public Gif() {
    }

    public Gif(Long id, String name, boolean favorite) {
        this.id = id;
        this.name = name;
        this.favorite = favorite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
