package com.FoldersAndFIles.components;

import com.FoldersAndFIles.models.File;
import com.FoldersAndFIles.models.Folder;
import com.FoldersAndFIles.models.User;
import com.FoldersAndFIles.repositories.FileRepository;
import com.FoldersAndFIles.repositories.FolderRepository;
import com.FoldersAndFIles.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User Seb = new User("Seb");
        userRepository.save(Seb);

        User Levi = new User("Levi");
        userRepository.save(Levi);

        User Edwin = new User("Edwim");
        userRepository.save(Edwin);

        Folder Recipes = new Folder("Recipes", Seb);
        folderRepository.save(Recipes);

        Folder DADA = new Folder("Defense Against the Dark Arts", Seb);
        folderRepository.save(DADA);

        Folder MuggleStudies = new Folder("Muggle Studies", Levi);
        folderRepository.save(MuggleStudies);

        Folder Animagi = new Folder("Animagi", Edwin);
        folderRepository.save(Animagi);

        File cake = new File("chocolate cake", ".txt", 28, Recipes);
        fileRepository.save(cake);

        File curry = new File("chickpea cake", ".txt", 18, Recipes);
        fileRepository.save(curry);

        File Lupin = new File("Year 3", ".txt", 100, DADA);
        fileRepository.save(Lupin);

        File Moody = new File("Year 4", ".txt", 100, DADA);
        fileRepository.save(Moody);

        File Coding = new File("Year 3", ".py", 56, MuggleStudies);
        fileRepository.save(Coding);

        File FellyTones = new File("Year 3", ".java", 85, MuggleStudies);
        fileRepository.save(FellyTones);

        File McGonagall = new File("Minerva McGonagall", ".txt", 100, Animagi);
        fileRepository.save(McGonagall);

        File Black = new File("Sirius Black", ".txt", 100, Animagi);
        fileRepository.save(Black);
    }
}
