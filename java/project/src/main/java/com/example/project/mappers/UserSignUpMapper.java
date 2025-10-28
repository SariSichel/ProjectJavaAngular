package com.example.project.mappers;

import com.example.project.dto.UserSignUpDTO;
import com.example.project.model.Users;
import com.example.project.service.PhotoUtils;
import org.mapstruct.Mapper;

import java.io.IOException;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UserSignUpMapper {
    List<UserSignUpDTO> usrsToUserSignUpDtoList(List<Users> l);
    Users userSignUpDTOtoUser(UserSignUpDTO u);
    default UserSignUpDTO userToUserSignUpDTO(Users u) throws IOException {
        UserSignUpDTO userSignUpDTO= new UserSignUpDTO();
        userSignUpDTO.setName(u.getUserName());
        userSignUpDTO.setPassword(u.getPassword());
        userSignUpDTO.setMail(u.getMail());
        userSignUpDTO.setPhoto(PhotoUtils.getImage(u.getPhotoPath()));
       return userSignUpDTO;
    }

}
