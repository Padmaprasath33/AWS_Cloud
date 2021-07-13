package com.awscloud.awscloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AwscloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwscloudApplication.class, args);
	}

}
