package com.xworkz.dependency.xworkz;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Data
@Component
@Scope("prototype")
public class Trainees {
    private int noTrainer;
    private int noBatch;
}
