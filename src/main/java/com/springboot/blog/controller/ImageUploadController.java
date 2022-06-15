package com.springboot.blog.controller;

import com.springboot.blog.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/posts")
public class ImageUploadController {

    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("/upload/db")
    public void uploadDb(@RequestParam("image")MultipartFile multipartFile){
        fileUploadService.uploadToDb(multipartFile);
    }
}
