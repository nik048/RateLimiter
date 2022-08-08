package repository;

import model.RateLimiter;
import model.Rule;

import java.util.HashMap;
import java.util.Map;

public class RuleRepository {
    Map<RateLimiter, Rule> rules = new HashMap<>();

    public RuleRepository() {
    }

    public void save(RateLimiter rateLimiter, Rule rule){
        this.rules.put(rateLimiter, rule);
    }
//    public void get
//    public boolean isRateLimitExausted(){
//
//    }
}
