package com.example.demo.Controller;

import com.example.demo.Entity.Document;
import com.example.demo.Entity.User;
import com.example.demo.Service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/")
public class DocumentController {

    @Autowired
    DocumentService documentService;

    @PostMapping(path = "upload")
    public String Upload(@RequestParam("file") MultipartFile[] file, @ModelAttribute Document document,
                         @ModelAttribute User user) {
        return documentService.uploadDocuments(file, document, user);
    }

}
