package controller;

import model.Rule;
import service.RuleService;

import java.util.List;

public class RuleController {
    RuleService ruleService;

    public void addRule(Rule rule){
        ruleService.addRule(rule);
    }

    public void addRules(List<Rule> rules){
        rules.forEach(
                (rule) -> ruleService.addRule(rule)
        );
    }

    public Rule getRule(String key){
        return this.ruleService.getRule(key);
    }

    public void removeRule(){

    }
    public void reloadRule(){

    }

}
