package com.gonzalo.projectyrd.models;

import javax.persistence.*;

@Entity
@Table(name="listing_image")
public class image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String path;

    @ManyToOne
    @JoinColumn(name = "listing_id")
    private Listing listing;

    public image() {
    }

    public image(long id, String path, Listing listing) {
        this.id = id;
        this.path = path;
        this.listing = listing;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Listing getListing() {
        return listing;
    }

    public void setListing(Listing listing) {
        this.listing = listing;
    }
}
