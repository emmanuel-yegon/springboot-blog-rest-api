package com.springboot.blog.repository;

import com.springboot.blog.entity.ImageUpload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageUploadRepository extends JpaRepository<ImageUpload, String>{

}
