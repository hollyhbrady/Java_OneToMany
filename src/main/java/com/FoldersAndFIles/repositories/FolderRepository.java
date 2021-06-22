package com.FoldersAndFIles.repositories;

import com.FoldersAndFIles.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
