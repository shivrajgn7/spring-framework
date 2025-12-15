package com.xworkz.train;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Data
@Component
@Scope("prototype")
public class Platform {

    @Autowired
    private int i;
}
