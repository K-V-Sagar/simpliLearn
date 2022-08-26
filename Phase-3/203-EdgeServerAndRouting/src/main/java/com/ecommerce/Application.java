package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Application {
		
		// http://localhost:8111/api/demo/products
		// run using above URL
        public static void main(String[] args) {
                SpringApplication.run(Application.class, args);
        }

}
