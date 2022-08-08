package model;

public class Rule {
    RateLimiter entity;

    public int getRequestRateLimit() {
        return requestRateLimit;
    }

    public int getRequestRateWindow() {
        return requestRateWindow;
    }

    int requestRateLimit;
    int requestRateWindow;

    public Rule(RateLimiter entity, int requestRateLimit, int requestRateWindow) {
        this.entity = entity;
        this.requestRateLimit = requestRateLimit;
        this.requestRateWindow = requestRateWindow;
    }


    public RateLimiter getEntity() {
        return entity;
    }
}
