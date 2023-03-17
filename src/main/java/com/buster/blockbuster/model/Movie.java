package com.buster.blockbuster.model;


public class Movie {
    private Long id;
    private String name;
    private Integer releaseDate;
    private Integer stock;
    private Double rentPrice;

    public Movie(Long id, String name, Integer releaseDate, Integer stock, Double rentPrice) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.stock = stock;
        this.rentPrice = rentPrice;
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

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Double rentPrice) {
        this.rentPrice = rentPrice;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", stock=" + stock +
                ", rentPrice=" + rentPrice +
                '}';
    }
}
