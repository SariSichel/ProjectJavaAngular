package com.example.project.mappers;

import com.example.project.dto.PostDTO;
import com.example.project.model.Post;
import org.mapstruct.Mapper;
import org.springframework.data.jpa.domain.JpaSort;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PostMapper {

    List<PostDTO> postsToDTO (List<Post> posts);
    //לא בטוח שצריך את זה
    Post postDTOtoPost(PostDTO post);
    
    default PostDTO postToDTO(Post p) throws IOException
    {
        PostDTO postDTO=new PostDTO();

        postDTO.setId(p.getId());
        postDTO.setName(p.getName());
        postDTO.setDescription(p.getDescription());
        postDTO.setLyrics(p.getLyrics());
        postDTO.setUpdateDate(p.getUpdateDate());
        postDTO.setUpdateDate(p.getUpdateDate());
//        postDTO.setUser(p.getUser());
//        postDTO.setCategory(p.getCategory());
//        postDTO.setUsersTookPart(p.getUsersTookPart());
//        postDTO.setComments(p.getComments());
        Path photoFileName=Paths.get(p.getPhotoPath());
        byte[] bytePhoto=Files.readAllBytes(photoFileName);
        postDTO.setPhoto(Base64.getEncoder().encodeToString(bytePhoto));

        Path audioFileName=Paths.get(p.getAudioPath());
        byte[] byteAudio=Files.readAllBytes(audioFileName);
        postDTO.setAudio(Base64.getEncoder().encodeToString(byteAudio));

        return postDTO;
    }

}
