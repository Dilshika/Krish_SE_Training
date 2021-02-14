package com.dil.cafecloud.cafeprocesstask;

import com.dil.cafecloud.cafeprocesstask.services.CafeProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


public class CafeProcessTaskRunner implements CommandLineRunner {

    @Autowired
    CafeProcessService cafeProcessService;

    @Override
    public void run(String... args) throws Exception {
        if(args.length>0) {
            System.out.println("task running with arguments");

            if (cafeProcessService.validatePhNumber(args[0])) {
                System.out.println("valid phone number");
            } else {
                System.out.println("Invalid phone number");
            }
        }else {
            System.out.println("tasks running without arguments");
        }
    }
}
