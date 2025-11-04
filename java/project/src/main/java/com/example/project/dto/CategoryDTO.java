package com.example.project.dto;
import java.util.List;
public class CategoryDTO {
    private int Id;
    private String Name;
//    private List<PostDTO> posts;

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

//    public List<PostDTO> getPosts() {
//        return posts;
//    }
//
//    public void setPosts(List<PostDTO> posts) {
//        this.posts = posts;
//    }
}
