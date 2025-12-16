package com.xworkz.fileapp.dao;

import com.xworkz.fileapp.dto.FileDto;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Component
public class FileDaoImpl implements FileDao{

    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    String url="jdbc:mysql://localhost:3306/file_app";
    String user="root";
    String password="@0995DuKe";

    @SneakyThrows
    @Override
    public boolean saveFile(FileDto fileDto) {
        System.out.println("Save file dao is started");

        String sqlQuery="insert into file_apps(fileName,fileType,fileSize) values (?,?,?)";
        try(Connection connection= DriverManager.getConnection(url,user,password);
            PreparedStatement preparedStatement1=connection.prepareStatement(sqlQuery)){
            System.out.println("JDBC is started");

           // preparedStatement1.setInt(1,fileDto.getId());
            preparedStatement1.setString(1,fileDto.getFileName());
            preparedStatement1.setString(2,fileDto.getFileType());
            preparedStatement1.setString(3,fileDto.getFileSize());

            int rows=preparedStatement1.executeUpdate();

            System.out.println("rows: "+rows);
            System.out.println("jdbc is endded");

        }

        return false;
    }
}
