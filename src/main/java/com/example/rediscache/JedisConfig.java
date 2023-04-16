package com.example.rediscache;

import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class JedisConfig {


    @Bean
    public JedisPool jedisPool()
    {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        String redisHost = "localhost";
        int redisPort = 6379;
//
//        JedisPool jedisPool = new JedisPool(poolConfig, redisHost, redisPort);
//        JedisPoolConfig poolConfig = new JedisPoolConfig();
        return new JedisPool(poolConfig, redisHost,redisPort);
    }
}
