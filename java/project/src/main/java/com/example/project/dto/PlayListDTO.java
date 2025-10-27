package com.example.project.dto;

import com.example.project.model.Post;
import com.example.project.model.Users;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.util.List;

public class PlayListDTO {
    private int Id;
    private String Name;
    private LocalDate creationDate;
    private LocalDate lastUpdated;
    private UsersTookPartDTO user;
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

    public UsersTookPartDTO getUser() {
        return user;
    }

    public void setUser(UsersTookPartDTO user) {
        this.user = user;
    }

    public List<PostDTO> getPosts() {
        return posts;
    }

    public void setPosts(List<PostDTO> posts) {
        this.posts = posts;
    }
}
