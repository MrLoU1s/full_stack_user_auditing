package com.muiyurocodes.full_stack_user_auditing.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig{
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}