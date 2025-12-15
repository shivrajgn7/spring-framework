package com.xworkz.runner;

import com.xworkz.config.CoreCnfig;
import com.xworkz.file.File;
import com.xworkz.film.Thetar;
import com.xworkz.laptop.Laptop;
import com.xworkz.train.Platform;
import com.xworkz.train.Train;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Field;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(CoreCnfig.class);

       Train train= applicationContext.getBean(Train.class);
        System.out.println(train);
        Train train1=applicationContext.getBean(Train.class);
        System.out.println(train1);

        train1.setPlace("KSR");
        System.out.println(train1);
        train1.setPlatform(new Platform());
        Platform platform=train1.getPlatform();
            platform.setI(32);
        System.out.println(train1);
//--------------------------------------------------------------LAPTOP-----------------------------------------
        Laptop laptop=applicationContext.getBean(Laptop.class);
        System.out.println(laptop);

        Laptop laptop1=applicationContext.getBean(Laptop.class);
        System.out.println(laptop1);

        //------------------------------------------------------FILE----------------------------------------------

        File file=applicationContext.getBean(File.class);
        System.out.println(file);

        File file1=applicationContext.getBean(File.class);
        System.out.println(file1);

        //-----------------------------------------------------Theater---------------------------------------------

        Thetar thetar=applicationContext.getBean(Thetar.class);
        System.out.println(thetar);

        Thetar thetar1=applicationContext.getBean(Thetar.class);
        System.out.println(thetar1);

        //---------------------------------------------------Mobile-----------------------------------------------



    }
}
