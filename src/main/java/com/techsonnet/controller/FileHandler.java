package com.techsonnet.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/file")
public class FileHandler {

    @PostMapping("/upload")
    public String upload(@RequestParam("img")MultipartFile img, HttpServletRequest request){
        if(img.getSize() > 0){
            String path = request.getSession().getServletContext().getRealPath("file");
            String name = img.getOriginalFilename();

            // 判断文件加是否存在，若不存在，则新建一个
            File  dir = new File(path);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            File file = new File(path,name);
            try {
                img.transferTo(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
