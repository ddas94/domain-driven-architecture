package com.hex.boot.config;

import com.hex.domain.StudentDomain;
import com.hex.jpa.config.JpaAdapterConfig;
import com.hexdomain.api.port.ObtainStudent;
import com.hexdomain.api.port.RequestStudent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JpaAdapterConfig.class)
public class BootstrapConfig {

    //create bean
    @Bean
    public RequestStudent getRequestStudent(ObtainStudent obtainStudent){
        return new StudentDomain(obtainStudent);
    }
}
