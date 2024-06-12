package com.thnp.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thnp.store.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {}
