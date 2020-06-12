package com.ssm.lisy.studentyml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ssm.lisy.studentyml.dao")
public class StudentymlApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentymlApplication.class, args);
    }

}
