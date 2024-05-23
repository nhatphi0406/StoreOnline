package com.thnp.store.service;

import com.thnp.store.dto.request.PermissionRequest;
import com.thnp.store.dto.response.PermissionResponse;
import com.thnp.store.entity.Permission;
import com.thnp.store.mapper.PermissionMapper;
import com.thnp.store.repository.PermissionRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class PermissionService {
    PermissionRepository permissionRepository;
    PermissionMapper permissionMapper;

    public PermissionResponse createPermission(PermissionRequest request) {
        Permission permission = permissionMapper.toPermission(request);

        return permissionMapper.toPermissionResponse(permissionRepository.save(permission));
    }

    public List<PermissionResponse> getPermissions() {
        return permissionRepository.findAll().stream().map(permissionMapper::toPermissionResponse).toList();
    }

    public void deletePermission(String permissionId) {
        permissionRepository.deleteById(permissionId);
    }
}
