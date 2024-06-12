package com.thnp.store.mapper;

import org.mapstruct.Mapper;

import com.thnp.store.dto.request.PermissionRequest;
import com.thnp.store.dto.response.PermissionResponse;
import com.thnp.store.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
