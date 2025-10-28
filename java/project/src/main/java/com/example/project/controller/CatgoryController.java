package com.example.project.controller;

import com.example.project.model.Category;
import com.example.project.service.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/Category")
@RestController
@CrossOrigin
public class CatgoryController {
    private CategoryRepository categoryRepository;

    @Autowired
    public CatgoryController(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }

    @GetMapping("/getCategoryById/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id){
        try{
            Category c=categoryRepository.findById(id).orElse(null);
            if(c==null){
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(c, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/addCategory")
    public ResponseEntity<Category> addCategory(@RequestBody Category t) {
        try {
            Category c = categoryRepository.save(t);
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
