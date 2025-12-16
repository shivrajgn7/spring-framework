package com.xworkz.fileapp.service;

import com.xworkz.fileapp.dto.FileDto;

public interface FileService {
    boolean validAndSave(FileDto fileDto);
}
