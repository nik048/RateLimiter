package service;

import model.Rule;
import repository.RuleRepository;

public class RuleService {
    RuleRepository ruleRepository;

    public RuleService(){

    }

    public void addRule(Rule rule){
        ruleRepository.save(rule.getEntity(), rule);
    }

//    public void reloadRule(){
//
//    }
//    public boolean isRateLimitExausted(){
//        return true;
//    }
}
