package com.example.project.mappers;

import com.example.project.dto.CategoryNameDTO;
import com.example.project.model.Category;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryNameDTO categoryToDTO(Category c);
    List<CategoryNameDTO> categoriesToDTO(List<Category> c);
    Category categoryDTOtoCategory(CategoryNameDTO c);
}
