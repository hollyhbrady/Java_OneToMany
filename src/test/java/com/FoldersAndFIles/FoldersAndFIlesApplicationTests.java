package com.FoldersAndFIles;

import com.FoldersAndFIles.models.File;
import com.FoldersAndFIles.models.Folder;
import com.FoldersAndFIles.models.User;
import com.FoldersAndFIles.repositories.FileRepository;
import com.FoldersAndFIles.repositories.FolderRepository;
import com.FoldersAndFIles.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FoldersAndFIlesApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createFilesAndFolders(){
		User Holly = new User("Holly");
		userRepository.save(Holly);
		Folder folder = new Folder("homework", Holly);
		folderRepository.save(folder);
		File file1 = new File("Java", ".txt", 56, folder);
		fileRepository.save(file1);
	}

}
