package com.xworkz.train;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("prototype")
public class Train {
    private String place;

    Platform platform;
}
