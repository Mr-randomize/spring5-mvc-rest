package com.iviberberi.spring5mvcrest.api.v1.mapper;

import com.iviberberi.spring5mvcrest.api.v1.model.CategoryDTO;
import com.iviberberi.spring5mvcrest.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;


@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
