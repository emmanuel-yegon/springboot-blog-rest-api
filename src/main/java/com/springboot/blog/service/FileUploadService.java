package com.springboot.blog.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
    public void uploadToDb(MultipartFile file);
}
