package service;

import controller.RuleController;
import model.RateLimiter;
import model.Rule;

import java.util.List;

public class RateLimitSystemService {
    RuleController ruleController = new RuleController();
    public boolean isRateLimitExausted(List<RateLimiter> entity){
        Rule rule = this.ruleController.getRule(entity);
        if (rule.getRequestRateLimit())
    }
}
