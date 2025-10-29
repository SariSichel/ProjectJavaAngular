package com.example.project.controller;

import com.example.project.dto.PlayListDTO;
import com.example.project.mappers.PlayListMapper;
import com.example.project.model.Category;
import com.example.project.model.PlayList;
import com.example.project.service.CategoryRepository;
import com.example.project.service.PlayListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/PlayList")
@RestController
@CrossOrigin
public class PlayListController {

    private PlayListRepository playListRepository;
    private PlayListMapper playListMapper;

    @Autowired
    public PlayListController(PlayListRepository playListRepository, PlayListMapper playListMapper) {
        this.playListRepository = playListRepository;
        this.playListMapper = playListMapper;
    }

    @GetMapping("/getPlayListById/{id}")
    public ResponseEntity<PlayListDTO> getCategoryById(@PathVariable Long id){
        try{
            PlayList p=playListRepository.findById(id).orElse(null);
            if(p==null){
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(playListMapper.playListToDTO(p), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/addPlayList")
    public ResponseEntity<PlayList> addPlayList(@RequestBody PlayList p) {
        try {
            PlayList c = playListRepository.save(p);
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
