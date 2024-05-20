package com.thnp.store.mapper;

import com.thnp.store.dto.request.UserCreationRequest;
import com.thnp.store.dto.request.UserUpdateRequest;
import com.thnp.store.dto.response.UserResponse;
import com.thnp.store.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
