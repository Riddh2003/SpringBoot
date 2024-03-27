package com.riddh.springboot.demo.myapplication;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyapplicationApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyapplicationApplication.class, args);
        Student st = context.getBean(Student.class);
        st.code();
	}
}
