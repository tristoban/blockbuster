package com.buster.blockbuster.model;

public class Client {

    private Long id;
    private String name;
    private String email;
    private Boolean state;


    public Client(Long id, String name, String email, Boolean state) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.state = state;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }


}
