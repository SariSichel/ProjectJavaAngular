package com.example.project.mappers;

import com.example.project.dto.UserNameDTO;
import com.example.project.model.Users;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface UserNameMapper {
    List<UserNameDTO> usersNameToDTO (List<Users> users);

    Users userNameDTOtoUsers(UserNameDTO UserTookPart);
    UserNameDTO userToDTO(Users user);
}
