package com.evross.persistence.entities;

public class Officer {
    private Integer id;
    private Rank rank;
    private String first;
    private String last;

    public Officer() {}

    public Officer(Rank rank, String first, String last){
        this.rank = rank;
        this.first = first;
        this.last = last;
    }

    public Officer(Integer id, Rank rank, String first, String last) {
        this.id = id;
        this.rank = rank;
        this.first = first;
        this.last = last;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Rank getRank() {
        return rank;
    }
}
