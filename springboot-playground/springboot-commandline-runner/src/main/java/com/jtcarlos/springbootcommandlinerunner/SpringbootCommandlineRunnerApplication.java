package com.jtcarlos.springbootcommandlinerunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringbootCommandlineRunnerApplication {
	private static final Logger LOG = LoggerFactory.getLogger(SpringbootCommandlineRunnerApplication.class);

	@Bean
	public CommandLineRunner run() throws Exception {
		return args -> {
			LOG.info("Starting application... \n");

			for (int counter = 1; counter <= 100; counter++) {
				if (counter % 3 == 0 && counter % 5 == 0) {
					LOG.info("FizzBuzz");
				} else if (counter % 3 == 0 ) {
					LOG.info("Fizz");
				} else if (counter % 5 == 0 ) {
					LOG.info("Buzz");
				} else {
					LOG.info(String.valueOf(counter));
				}
			}

			LOG.info("Finishing application... \n");
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCommandlineRunnerApplication.class, args);
	}

}
