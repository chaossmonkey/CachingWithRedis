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


    //Yes, Jedis can be incorporated into the RedisTemplate provided by Spring Data Redis.
    // RedisTemplate is a high-level abstraction for working with Redis,
    // and it simplifies the interactions with the Redis server.
    // Here's an example of how to configure RedisTemplate with Jedis:


    //In a Spring Boot application, using RedisTemplate is recommended over the direct use of Jedis.
    // RedisTemplate is a high-level abstraction provided by Spring Data Redis that simplifies
    // the interaction with Redis server and offers additional features.
    public static void main(String[] args) {
        SpringApplication.run(RedisCacheApplication.class, args);
    }

}
