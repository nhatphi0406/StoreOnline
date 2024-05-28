package com.thnp.store.mapper;

import com.thnp.store.dto.request.UserCreationRequest;
import com.thnp.store.dto.request.UserUpdateRequest;
import com.thnp.store.dto.response.UserResponse;
import com.thnp.store.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings({
            @Mapping(target = "roles", ignore = true),
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "dateJoined", ignore = true),
            @Mapping(target = "updatedDate", ignore = true),
            @Mapping(target = "isActive", ignore = true),
    })
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
