package repository;

import model.RateLimiter;
import model.Rule;

import java.util.HashMap;
import java.util.Map;

public class RateLimiterRepository {
    Map<String, Integer> requestCount = new HashMap<>();

    public void save(String key, int requestCount){

        this.requestCount.put(key, requestCount);
    }

    public int  get(String key){
        return this.requestCount.get(key);
    }
}
