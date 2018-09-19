package com.greenfoxacademy.workwithdependencies;

import com.greenfoxacademy.workwithdependencies.services.Printer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkwithdependenciesApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor myColor;

    public WorkwithdependenciesApplication(Printer printer, MyColor myColor) {
        this.printer = printer;
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(WorkwithdependenciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");
        myColor.printColor();
    }


}
