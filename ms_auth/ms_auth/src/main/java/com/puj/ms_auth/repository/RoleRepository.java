package com.puj.ms_auth.repository;

import com.puj.ms_auth.entity.Role;
import com.puj.ms_auth.enums.RoleNames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(RoleNames roleName);
}
