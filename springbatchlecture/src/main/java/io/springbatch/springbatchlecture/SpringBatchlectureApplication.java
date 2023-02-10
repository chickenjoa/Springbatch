package io.springbatch.springbatchlecture;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchlectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchlectureApplication.class, args);
	}


}
