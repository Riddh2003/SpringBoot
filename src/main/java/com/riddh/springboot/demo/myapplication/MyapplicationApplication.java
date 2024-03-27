package com.riddh.springboot.demo.myapplication;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyapplicationApplication {
	public static void main(String[] args) {
		ApplicationContext context = (ApplicationContext) SpringApplication.run(MyapplicationApplication.class, args);
        Student st = context.getBean(Student.class);
        st.code();
	}
}
