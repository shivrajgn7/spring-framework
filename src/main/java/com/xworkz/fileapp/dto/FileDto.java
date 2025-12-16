package com.xworkz.fileapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileDto {
    private int id;
    private String fileName;
    private String fileType;
    private  String fileSize;
//
//    public FileDto(int id, String fileName, String fileType, String fileSize){
//        this.id=id;
//        this.fileName=fileName;
//        this.fileType=fileType;
//        this.fileSize=fileSize;
//    }
}
