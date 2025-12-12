package com.xworkz.dependency.runner;

import com.xworkz.dependency.config.CoreCnfig;
import com.xworkz.dependency.laptop.Company;
import com.xworkz.dependency.laptop.OS;
import com.xworkz.dependency.xworkz.Branch;
import com.xworkz.dependency.xworkz.Trainees;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Main started");

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(CoreCnfig.class);

       Company company=applicationContext.getBean(Company.class);
       OS os=company.getOs();
        System.out.println(company);



        Branch branch=applicationContext.getBean(Branch.class);
        Trainees trainees=branch.getTrainees();

         trainees.setNoTrainer(200);
        trainees.setNoBatch(10);
        //System.out.println(trainees);

//        Trainees trainees1=branch.getTrainees();
        trainees.setNoBatch(500);
       trainees.setNoTrainer(20);
//        System.out.println(trainees1);

        Branch branch1=applicationContext.getBean(Branch.class);
        Trainees trainees1=branch1.getTrainees();
        System.out.println(trainees);
        System.out.println(trainees1);

        branch.setBranch1("RAJAJINAGARA");
        branch.setBranch2("BTM");

        System.out.println(branch);







    }

}
