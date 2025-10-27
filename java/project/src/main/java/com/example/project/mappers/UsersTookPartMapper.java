package com.example.project.mappers;

import com.example.project.dto.PlayListDTO;
import com.example.project.dto.UsersTookPartDTO;
import com.example.project.model.PlayList;
import com.example.project.model.Post;
import com.example.project.model.Users;

import java.util.List;

public interface UsersTookPartMapper {
//אין הכוונה בהכרח למשתמשים שהם זמרים   אלא לכל המקרים בהם יש צורך רק בשם המשתמש/היוצר/הזמר
    List<UsersTookPartDTO> usersTookPartToDTO (List<Users> users);

    Users usersTookPartDTOtoUsers(UsersTookPartDTO UserTookPart);

    UsersTookPartDTO userToDTO(Users user);
}
