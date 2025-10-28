package com.example.project.dto;

import java.time.LocalDate;
import java.util.List;

public class PlayListDTO {
    private int Id;
    private String Name;
    private LocalDate creationDate;
    private LocalDate lastUpdated;
    private UserNameDTO user;
    private List<PostDTO> posts;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public UserNameDTO getUser() {
        return user;
    }

    public void setUser(UserNameDTO user) {
        this.user = user;
    }

    public List<PostDTO> getPosts() {
        return posts;
    }

    public void setPosts(List<PostDTO> posts) {
        this.posts = posts;
    }
}
