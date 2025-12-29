package com.xworkz.fileapp.dao;

import com.mysql.cj.LicenseConfiguration;
import com.xworkz.fileapp.dto.FileDto;
import lombok.SneakyThrows;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import javax.swing.plaf.PanelUI;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

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
        System.out.println("hibernate connection is started");
        Configuration configuration=new Configuration() ;
        configuration.configure();
        configuration.addAnnotatedClass(FileDto.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(fileDto);
        transaction.commit();

        return true;

    }

      /*  System.out.println("Save file dao is started");

        String sqlQuery="insert into file_apps(fileName,fileType,fileSize,fileid) values (?,?,?,?)";
        try(Connection connection= DriverManager.getConnection(url,user,password);
            PreparedStatement preparedStatement1=connection.prepareStatement(sqlQuery)){
            System.out.println("JDBC is started");

           // preparedStatement1.setInt(1,fileDto.getId());
            preparedStatement1.setString(1,fileDto.getFileName());
            preparedStatement1.setString(2,fileDto.getFileType());
            preparedStatement1.setString(3,fileDto.getFileSize());
            preparedStatement1.setString(4,fileDto.getFileNumber());

            int rows=preparedStatement1.executeUpdate();

            System.out.println("rows: "+rows);
            System.out.println("jdbc is endded");

        }

        return false;
    }*/
@SneakyThrows
    @Override

    public Optional<FileDto> getByName(String name) {
        String sql="select * from file_apps where fileName=?;";
        try(Connection connection=DriverManager.getConnection(url,user,password);
        PreparedStatement preparedStatement=connection.prepareStatement(sql)) {

            preparedStatement.setString(1, name);

            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Row is exicuted: " + resultSet);

            while (resultSet.next()) {
                String fileName = resultSet.getString(2);
                String type = resultSet.getString(3);
                String size = resultSet.getString(4);
                String number = resultSet.getString(5);

                FileDto fileDto = new FileDto(fileName, type, size, number);
                System.out.println("File data: " + fileDto);

                return Optional.of(fileDto);
            }
        }
            System.out.println("Result set is not found");

        return Optional.empty();
    }

    @SneakyThrows
    @Override
    public boolean updateByName(FileDto fileDto) {
        String updateQ="update file_apps set fileType=?,fileSize=?,fileid=? where fileName=? ";

        try(Connection connection=DriverManager.getConnection(url,user,password);
        PreparedStatement preparedStatement=connection.prepareStatement(updateQ)){

            preparedStatement.setString(1,fileDto.getFileType());
            preparedStatement.setString(2,fileDto.getFileSize());
            preparedStatement.setString(3 ,fileDto.getFileNumber());
            preparedStatement.setString(4,fileDto.getFileName());
            int rowaffected=preparedStatement.executeUpdate();
            if(rowaffected<0){
                return true;
            }
            else
                return false;

        }

    }


}
