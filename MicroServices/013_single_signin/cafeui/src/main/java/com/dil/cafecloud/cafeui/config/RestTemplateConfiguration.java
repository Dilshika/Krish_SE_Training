package com.dil.cafecloud.cafeui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class RestTemplateConfiguration {

    @Bean
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
