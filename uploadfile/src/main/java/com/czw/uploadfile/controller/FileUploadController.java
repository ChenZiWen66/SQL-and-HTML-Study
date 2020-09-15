package com.czw.uploadfile.controller;

import com.czw.uploadfile.UploadfileApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/file")
@CrossOrigin
public class FileUploadController {
    private static final Logger LOG = LoggerFactory.getLogger(UploadfileApplication.class);

    @PostMapping("/upload")
    public String uploadfile(@RequestParam(value = "uploadfile") MultipartFile file) throws IOException {
        LOG.info("上传文件开始{}", file);
        LOG.info("文件路径{}", file.getOriginalFilename());
        LOG.info("文件大小{}", file.getSize());
        LOG.info("文件类型{}",file.getContentType());

//        保存文件到本地
        String fileName = file.getOriginalFilename();
        UUID key = UUID.randomUUID();
        String fileFullPath = "C:/Users/adm/Desktop/" + key.toString() + fileName;
        File destination = new File(fileFullPath);
        file.transferTo(destination);
        return "上传成功";
    }
}
