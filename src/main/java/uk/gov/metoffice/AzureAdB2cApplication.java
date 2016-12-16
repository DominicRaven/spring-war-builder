package uk.gov.metoffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class AzureAdB2cApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AzureAdB2cApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureAdB2cApplication.class, args);
	}
}
