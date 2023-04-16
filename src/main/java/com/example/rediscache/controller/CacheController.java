package com.example.rediscache.controller;

import com.example.rediscache.service.JedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    private final JedisService customCacheService;

    @Autowired
    public CacheController(JedisService customCacheService) {
        this.customCacheService = customCacheService;
    }



//    http://localhost:8080/cache/temporaryUser/johndoe
    @GetMapping("/cache/{key}/{value}")
    public String setToCache(@PathVariable String key, @PathVariable String value) {
        customCacheService.set(key, value);
        return "Value set to cache: " + key + " => " + value;
    }

    //    http://localhost:8080/cache/temporaryUser
    @GetMapping("/cache/{key}")
    public String getFromCache(@PathVariable String key) {
        return customCacheService.get(key);
    }

                                   //KEY         //Val    //secondsToValue
//    http://localhost:8080/cache/temporaryUser/tempUser/60
    @GetMapping("/cache/{key}/{value}/{ttl}")
    public String setToCacheWithTTL(@PathVariable String key, @PathVariable String value, @PathVariable int ttl) {
        customCacheService.setWithTTL(key, value, ttl);
        return "Value set to cache with TTL: " + key + " => " + value + " (TTL: " + ttl + " seconds)";
    }
}