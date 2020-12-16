package com.hex.jpa.config;

import com.hex.jpa.StudentRepository;
import com.hex.jpa.dao.StudentDao;
import com.hexdomain.api.port.ObtainStudent;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {"com.hex.jpa.entity"})
@EnableJpaRepositories(basePackages = {"com.hex.jpa.dao"})
public class JpaAdapterConfig {

    @Bean
    public ObtainStudent getStudentRepository(StudentDao studentDao){
        return new StudentRepository(studentDao);
    }
}
