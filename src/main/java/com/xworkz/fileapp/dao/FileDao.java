package com.xworkz.fileapp.dao;

import com.xworkz.fileapp.dto.FileDto;
import com.xworkz.fileapp.service.FileService;

public interface FileDao {
    boolean saveFile(FileDto fileDto);
}
