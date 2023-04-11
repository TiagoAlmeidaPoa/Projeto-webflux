package com.tiago.webfluxcourse.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.tiago.webfluxcourse.entity.User;
import com.tiago.webfluxcourse.model.request.UserRequest;

@Mapper(
		componentModel = "spring"
		)
public interface UserMapper {
	
	@Mapping(target = "id", ignore = true)
	User toEntity(final UserRequest request);
}
