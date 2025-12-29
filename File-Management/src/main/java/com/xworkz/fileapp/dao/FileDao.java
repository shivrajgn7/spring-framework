package com.xworkz.fileapp.dao;

import com.xworkz.fileapp.dto.FileDto;

import java.io.File;
import java.util.Optional;

public interface FileDao {
    boolean saveFile(FileDto fileDto);

   // Optional<FileDto> getByName(String name);

boolean updateByName(FileDto fileDto);

    Optional<FileDto> getByName(String fileName);
}
