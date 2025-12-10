package com.xworkz;

import com.xworkz.classes.*;
import com.xworkz.config.ConfigInternet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {


        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigInternet.class);

        Internet internet=applicationContext.getBean(Internet.class);
        internet.setInternetName("Jio");
        internet.setCountry("India");

        System.out.println(internet);

        Laptop laptop=applicationContext.getBean(Laptop.class);
        laptop.setLaptopId(45);
        laptop.setLaptopCName("Lenovo");
        System.out.println(laptop);

        Window window=applicationContext.getBean(Window.class);
        window.setId(34);
        window.setType("Wood");
        System.out.println(window);

        KeyPad keyPad=applicationContext.getBean(KeyPad.class);
        keyPad.setNoKeys(52);
        keyPad.setCompany("Fontex");
        System.out.println(keyPad);

        Mobile mobile=applicationContext.getBean(Mobile.class);
        mobile.setId(23);
        mobile.setCompany("Moto");
        System.out.println(mobile);

        //here we used getAge method name in getBean
       //  gt Integer age1=applicationContext.getBean("getAge",Integer.class);


        //here we takind bean name in method like @Bean("age")
        Integer age=applicationContext.getBean("age",Integer.class);
        System.out.println(age);

        Float amount=applicationContext.getBean("amt",Float.class);
        System.out.println(amount);


    }
}
