package com.apress.springpersistence.audiomanager;

import com.apress.springpersistence.audiomanager.core.config.AudioManagerCoreConfig;
import com.apress.springpersistence.audiomanager.web.config.WebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.*;


/**
 * Created by pfisher on 9/27/14.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
@EnableJpaRepositories
@Import({AudioManagerCoreConfig.class, WebConfiguration.class, RepositoryRestMvcConfiguration.class})
@EnableAutoConfiguration
public class AudioManagerApplication {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(AudioManagerApplication.class, args);
    }
}
