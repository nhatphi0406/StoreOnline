package com.thnp.store.mapper;

import com.thnp.store.dto.request.RoleRequest;
import com.thnp.store.dto.response.RoleResponse;
import com.thnp.store.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);
    RoleResponse toRoleResponse(Role role);
}
