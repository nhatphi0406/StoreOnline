package com.thnp.store.controller;

import com.thnp.store.dto.request.PermissionRequest;
import com.thnp.store.dto.response.ApiResponse;
import com.thnp.store.dto.response.PermissionResponse;
import com.thnp.store.service.PermissionService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permissions")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class PermissionController {
    PermissionService permissionService;

    @PostMapping
    public ApiResponse<PermissionResponse> createPermission(@RequestBody PermissionRequest request) {
        return ApiResponse.<PermissionResponse>builder()
                .result(permissionService.createPermission(request))
                .build();
    }

    @GetMapping
    public ApiResponse<List<PermissionResponse>> getPermissions() {
        return ApiResponse.<List<PermissionResponse>>builder()
                .result(permissionService.getPermissions())
                .build();
    }

    @DeleteMapping("{permissionId}")
    public ApiResponse<Void> deletePermission(@PathVariable("permissionId") String permissionId) {
        permissionService.deletePermission(permissionId);
        return ApiResponse.<Void>builder().build();
    }
}
