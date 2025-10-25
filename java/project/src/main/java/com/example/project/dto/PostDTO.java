package com.example.project.dto;

import com.example.project.model.Category;
import com.example.project.model.Comment;
import com.example.project.model.PlayList;
import com.example.project.model.Users;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class PostDTO {
    private int Id;
    private String Name;
    private String description;
    private String lyrics;
    private String audio;
    private String audioPath;
    private LocalDate uploadDate;
    private LocalDate updateDate;
    private String photoPath;
    private  String photo;
    //מעלה הפוסט
    private UsersTookPartDTO user;
    private CategoryNameDTO category;
    private List<UsersTookPartDTO> usersTookPart;
    private List<CommentDTO> comments;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public UsersTookPartDTO getUser() {
        return user;
    }


    public void setUser(UsersTookPartDTO user) {
        this.user = user;
    }

    public CategoryNameDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryNameDTO category) {
        this.category = category;
    }

    public List<UsersTookPartDTO> getUsersTookPart() {
        return usersTookPart;
    }

    public void setUsersTookPart(List<UsersTookPartDTO> usersTookPart) {
        this.usersTookPart = usersTookPart;
    }

    public List<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }

    public String getAudioPath() {
        return audioPath;
    }

    public void setAudioPath(String audioPath) {
        this.audioPath = audioPath;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


}
