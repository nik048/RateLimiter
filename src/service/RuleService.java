package service;

import model.RateLimiter;
import model.Rule;
import repository.RuleRepository;

public class RuleService {
    RuleRepository ruleRepository;

    public RuleService(){

    }

    public void addRule(Rule rule){
        ruleRepository.save(rule.getEntity(), rule);
    }
    public Rule getRule(String key){
        return ruleRepository.get(key);
    }
}
