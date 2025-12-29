package com.xworkz.fileapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="file_apps")
public class FileDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name="fileName")
    private String fileName;
    @Column(name="fileType")
    private String fileType;
    @Column(name = "fileSize")
    private  String fileSize;
    @Column(name = "fileid")
    private String fileNumber;

    public FileDto(String fileName, String type, String size, String number) {
    }
//
//    public FileDto(int id, String fileName, String fileType, String fileSize){
//        this.id=id;
//        this.fileName=fileName;
//        this.fileType=fileType;
//        this.fileSize=fileSize;
//    }
}
