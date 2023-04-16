package com.example.rediscache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class RedisCacheApplication {

    //BASICALLY THIS PART WAS TAKEN OUT OF THE APPLICATION INSTEAD WE JUST USE JEDIS TO PERFORM ALL OF THE REST

//    <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-data-redis</artifactId>
//        </dependency>
    public static void main(String[] args) {
        SpringApplication.run(RedisCacheApplication.class, args);
    }

}
