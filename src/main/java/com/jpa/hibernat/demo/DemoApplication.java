package com.jpa.hibernat.demo;

import com.jpa.hibernat.demo.Entity.Course;
import com.jpa.hibernat.demo.Respository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


			int prices[] ={7,1,5,3,6,4};

			int prof=0;

			for (int i = 1; i < prices.length; i++) {
				/*
				 * If the current element is equal to the next element, then skip the current
				 * element because it's a duplicate.
				 */
				int diff = prices[i]-prices[i-1];
				if(diff>0){
					prof+=diff;
				}

			}






		Course course = courseRepository.findById(10001L);

		logger.info("{Course 10001 ->}",course);

		courseRepository.deleteById(10001L);
	}
}
