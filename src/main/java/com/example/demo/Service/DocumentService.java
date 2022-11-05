package com.example.demo.Service;


import com.example.demo.Entity.Document;
import com.example.demo.Entity.User;
import org.springframework.web.multipart.MultipartFile;

public interface DocumentService {

    public String uploadDocuments(MultipartFile[] file, Document document, User user);


}
