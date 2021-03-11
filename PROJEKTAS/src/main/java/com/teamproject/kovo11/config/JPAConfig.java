package com.teamproject.kovo11.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.teamproject.kovo11.lecturer"})
public class JPAConfig {
}
