package com.xdebuggers.csframeworkapp.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable(value = "longterm-cache")
    public String getCachedData() {
        System.out.println("Fetching data from the method and caching it.");
        return "Cached Data";
    }
}
