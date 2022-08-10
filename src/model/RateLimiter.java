package model;

public class RateLimiter {
    EntityType entityType;
    int currentRequestCount = 0;
    public RateLimiter(EntityType entityType) {
        this.entityType = entityType;
    }
}
