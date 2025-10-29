package com.example.project.controller;

import com.example.project.dto.CommentDTO;
import com.example.project.mappers.CommentMapper;
import com.example.project.model.Category;
import com.example.project.model.Comment;
import com.example.project.service.CategoryRepository;
import com.example.project.service.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/Comment")
@RestController
@CrossOrigin
public class CommentController {

    private CommentRepository commentRepository;
    private CommentMapper commentMapper;

    @Autowired
    public CommentController(CommentRepository commentRepository, CommentMapper commentMapper) {
        this.commentRepository = commentRepository;
        this.commentMapper = commentMapper;
    }

    @GetMapping("/getCommentById/{id}")
    public ResponseEntity<CommentDTO> getCommentById(@PathVariable Long id){
        try{
            Comment c=commentRepository.findById(id).orElse(null);
            if(c==null){
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(commentMapper.commentToDTO(c), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/addComment")
    public ResponseEntity<Comment> addComment(@RequestBody Comment c) {
        try {
            Comment c1 = commentRepository.save(c);
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
