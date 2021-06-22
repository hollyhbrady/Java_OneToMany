package com.FoldersAndFIles.repositories;

import com.FoldersAndFIles.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
