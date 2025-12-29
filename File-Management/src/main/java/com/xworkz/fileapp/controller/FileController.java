package com.xworkz.fileapp.controller;

import com.xworkz.fileapp.dto.FileDto;
import com.xworkz.fileapp.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Component
@RequestMapping("/")
public class FileController {
    FileController(){
        System.out.println("File Controller object is created");
    }

        @Autowired
    FileService fileService;


    @PostMapping("/file")
    public String addFile(FileDto fileDto){
        System.out.println("Added file is started");
        System.out.println(fileDto);

        boolean valid=fileService.validAndSave(fileDto);
        if(!valid)return "Result";
            else
        return "Error";
    }

    @GetMapping("/search")
    public String searchByFileName(@RequestParam("fileName") String fileName, Model model){
        System.out.println(fileName);

        Optional<FileDto> dto= fileService.getName(fileName);
        model.addAttribute("file",dto.get());
        System.out.println("controller"+dto);
        return "Search";
    }

    @GetMapping("/getFile/{name}")
    public String getFile(@PathVariable("name") String fileName, Model model , HttpServletRequest req){
        System.out.println("File Name: "+fileName);
        Optional<FileDto> dto= fileService.getName(fileName);
        model.addAttribute("fileDto",dto.get());

        return "UpdateFile";
    }


    @PostMapping("/update")
    public String updateFile(FileDto fileDto){
        System.out.println("Update file is started");
        System.out.println(fileDto);
        boolean valid=fileService.updateAndSave(fileDto);
        if(!valid)return "/Result";
        else
            return "Error";
    }

}
