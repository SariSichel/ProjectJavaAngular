package com.example.project.mappers;

import com.example.project.dto.PlayListDTO;
import com.example.project.dto.PostDTO;
import com.example.project.model.PlayList;
import com.example.project.model.Post;

import java.util.List;

public interface PlayListMapper {

    List<PlayListDTO> playListsToDTO (List<Post> posts);

    PlayList playListDTOtoPost(PlayListDTO playList);

    PlayListDTO playListToDTO(PlayList playList);
}
