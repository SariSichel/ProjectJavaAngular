package com.example.project.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private int Id;
    private String Name;
    private String description;
    private String lyrics;
    private String audio;
    private LocalDate uploadDate;
    private LocalDate updateDate;

    //relations
   @ManyToOne
    private Users user;

   @ManyToOne
   private Category category;

   //רשימת הזמרים ששרו בפוסט הזה
   @ManyToMany
   private List<Users> usersTookPart;

   @OneToMany(mappedBy = "post")
   private List<Comment> comments;



    public Post(int postId, String postName, String description, String lyrics, LocalDate uploadDate, LocalDate updateDate, Users user, Category category, List<Users> usersTookPart, List<Comment> comments, PlayList playList, String audio) {
        this.Id = postId;
        this.Name = postName;
        this.description = description;
        this.lyrics = lyrics;
        this.uploadDate = uploadDate;
        this.updateDate = updateDate;
        this.user = user;
        this.category = category;
        this.usersTookPart = usersTookPart;
        this.comments = comments;
        this.audio= audio;
    }

    public Post() {

    }

    public int getPostId() {
        return Id;
    }

    public void setPostId(int postId) {
        this.Id = postId;
    }

    public String getPostName() {
        return Name;
    }

    public void setPostName(String postName) {
        this.Name = postName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public String getAudio() {
        return audio;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Users> getUsersTookPart() {
        return usersTookPart;
    }

    public void setUsersTookPart(List<Users> usersTookPart) {
        this.usersTookPart = usersTookPart;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }


    public void setAudio(String audio) {
        this.audio = audio;
    }
}
