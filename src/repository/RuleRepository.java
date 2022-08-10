package repository;

import model.RateLimiter;
import model.Rule;

import java.util.HashMap;
import java.util.Map;

public class RuleRepository {
    Map<String, Rule> rules = new HashMap<>();

    public RuleRepository() {
    }

    public void save(String key, Rule rule){
        this.rules.put(key, rule);
    }

    public Rule get(String key){
        return this.rules.get(key);
    }


}
