package model;

public class ApiKeyRateLimiter extends RateLimiter{
    String key;

    public ApiKeyRateLimiter(EntityType entityType, String key) {
        super(entityType);
        this.key = key;
    }
}
