package com.thnp.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thnp.store.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {}
