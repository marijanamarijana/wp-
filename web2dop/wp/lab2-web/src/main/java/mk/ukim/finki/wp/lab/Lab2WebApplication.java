package mk.ukim.finki.wp.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Lab2WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab2WebApplication.class, args);
    }

}
