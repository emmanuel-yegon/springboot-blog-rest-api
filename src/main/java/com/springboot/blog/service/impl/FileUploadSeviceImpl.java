package com.springboot.blog.service.impl;

import com.springboot.blog.entity.ImageUpload;
import com.springboot.blog.repository.ImageUploadRepository;
import com.springboot.blog.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileUploadSeviceImpl implements FileUploadService {
    @Autowired
    private ImageUploadRepository imageUploadRepository;
    @Override
    public void uploadToDb(MultipartFile file) {
        ImageUpload uploadedFile = new ImageUpload();
        try {
            uploadedFile.setFileData(file.getBytes());
            uploadedFile.setFileType(file.getContentType());
            uploadedFile.setFileName(file.getOriginalFilename());
            imageUploadRepository.save(uploadedFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
