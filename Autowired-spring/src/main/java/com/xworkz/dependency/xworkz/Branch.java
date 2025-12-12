package com.xworkz.dependency.xworkz;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Branch {
    private int noBranch;
    private String branch1;
    private  String branch2;

    @Autowired
    Trainees trainees;


}

