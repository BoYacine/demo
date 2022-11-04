package com.example.demo.Service;

import com.example.demo.Entity.Document;
import com.example.demo.Entity.User;
import com.example.demo.Repository.DocumentRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    DocumentRepository documentRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserServicePath userServicePath;

    @Override
    public String uploadDocuments(MultipartFile[] file, Document document, User user) {

        String fileName = "";
        String[] format = null;
        float size = 0;
        Path path = null;
        Long numberDocuments = documentRepository.count();

        for (MultipartFile multipartFile : file) {
            // get information from file
            fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
            format = fileName.split("\\.");
            size = multipartFile.getSize() / 1024;
            path = Paths.get(userServicePath.getUserPath(user.getId())+"/"+fileName);
            try {
                // copy file to destination
                Files.copy(multipartFile.getInputStream() , path, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
            document.setId(documentRepository.count() + 1);
            document.setName(fileName);
            document.setPath(path + "");
            document.setSize(size);
            document.setFormat(format[1]);
            document.setDate(new Date());
            document.setUser(user);
            documentRepository.save(document);
        }
         return path + "    " + format[1] + "    " + size + "    " + numberDocuments;
    }
}
