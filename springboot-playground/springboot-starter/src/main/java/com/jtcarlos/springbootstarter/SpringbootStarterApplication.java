package com.jtcarlos.springbootstarter;

import com.jtcarlos.springbootstarter.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringbootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStarterApplication.class, args);
	}

}
