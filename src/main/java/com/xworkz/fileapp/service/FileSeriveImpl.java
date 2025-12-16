package com.xworkz.fileapp.service;

import com.xworkz.fileapp.dao.FileDao;
import com.xworkz.fileapp.dto.FileDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileSeriveImpl implements FileService{
@Autowired
   private FileDao fileDao;

    @Override
    public boolean validAndSave(FileDto fileDto) {
        System.out.println("Validation is started");
        boolean inValid=false;
        if(fileDto!=null){
            if(fileDto.getId()==0){
                inValid=true;
            }
            if(fileDto.getFileName()==null||fileDto.getFileName().length()>=5){
                inValid=true;

            }
            if(fileDto.getFileType()==null||fileDto.getFileType().length()>=5){
                inValid=true;
            }
            if(fileDto.getFileSize()==null||fileDto.getFileType().length()>=5){
                inValid=true;
            }
        }
        if(!inValid){
            System.out.println("Valid and save done dao is startd");
            fileDao.saveFile(fileDto);
        }else{
            System.out.println("Validation is not working");
        }


        return inValid;
    }
}
