package cn.bdqn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[]args){
        System.out.println("成功了耶");
        SpringApplication.run(Application.class,args);
    }
}
