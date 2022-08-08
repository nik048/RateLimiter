package model;

public class EndPointRateLimiter extends RateLimiter{
    String endpoint;

    public EndPointRateLimiter(EntityType entityType, String endpoint) {
        super(entityType);
        this.endpoint = endpoint;
    }
}
