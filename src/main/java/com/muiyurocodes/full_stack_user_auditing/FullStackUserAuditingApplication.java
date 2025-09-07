package com.muiyurocodes.full_stack_user_auditing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class FullStackUserAuditingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackUserAuditingApplication.class, args);
	}

}
