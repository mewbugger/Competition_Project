package com.wly.competition_project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wly.competition_project.dao.mapper")
public class CompetitionProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompetitionProjectApplication.class, args);
    }

}
