package com.thnp.store.controller;

import com.thnp.store.dto.request.RoleRequest;
import com.thnp.store.dto.response.ApiResponse;
import com.thnp.store.dto.response.RoleResponse;
import com.thnp.store.service.RoleService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class RoleController {
    RoleService roleService;

    @PostMapping
    public ApiResponse<RoleResponse> createRole(@RequestBody RoleRequest request) {
        return ApiResponse.<RoleResponse>builder()
                .result(roleService.createRole(request))
                .build();
    }

    @GetMapping
    public ApiResponse<List<RoleResponse>> getRoles() {
        return ApiResponse.<List<RoleResponse>>builder()
                .result(roleService.getRoles())
                .build();
    }

    @DeleteMapping("{roleId}")
    public ApiResponse<Void> deleteRole(@PathVariable("roleId") String roleId) {
        roleService.deleteRole(roleId);
        return ApiResponse.<Void>builder().build();
    }
}
