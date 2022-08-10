package service;

import controller.RuleController;
import model.RateLimiter;
import model.Rule;
import model.Timer;
import repository.RateLimiterRepository;
import java.time.Instant;

import java.util.List;

public class RateLimitSystemService {
    RuleController ruleController = new RuleController();
    RateLimiterRepository rateLimiterRepository = new RateLimiterRepository();

    public boolean isRateLimitExausted(List<String> entity){

        for(String e: entity){
            Rule rule = this.ruleController.getRule(e);

            if (!this.evaluateRule(rule)){
                return false;
            }
        }
        return true;
    }

    private boolean evaluateRule(Rule rule){
        long startTime   = Timer.getStartTime();
        long currentTime = Instant.now().toEpochMilli();

        int totalRequestCount = this.rateLimiterRepository.get(rule.getEntity());
        int requestLimit        = rule.getRequestRateLimit();
        int requestTTLWindow    = rule.getRequestRateWindowInMilli();

        if(totalRequestCount == 0){
            return true;
        }
        else {
            long totalTimeElapsed = currentTime - startTime;
            long currentWindowTimeRemaining = totalTimeElapsed % requestTTLWindow;
            long totalWindowsFinished = totalTimeElapsed / requestTTLWindow;
            long  currentRequestCount = totalRequestCount - (totalWindowsFinished * requestLimit);
        }

        return true;
    }
}
