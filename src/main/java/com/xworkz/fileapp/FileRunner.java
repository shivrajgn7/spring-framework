package com.xworkz.fileapp;

import com.xworkz.fileapp.config.FileConfig;
import com.xworkz.fileapp.dto.FileDto;
import com.xworkz.fileapp.service.FileService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class FileRunner {
    public static void main(String[] args) {
        FileDto fileDto = new FileDto();
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(FileConfig.class);
        fileDto.setId(43);
        fileDto.setFileName("Sss");
        fileDto.setFileType("pdf");
        fileDto.setFileSize("400KB");
        System.out.println(fileDto);

        FileService fileService=applicationContext.getBean(FileService.class);
        fileService.validAndSave(fileDto);



    }
}
