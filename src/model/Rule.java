package model;

public class Rule {
    String entity;
    int requestRateLimit;
    int requestRateWindowMilli;

    public int getRequestRateLimit() {
        return requestRateLimit;
    }

    public int getRequestRateWindowInMilli() {
        return requestRateWindowMilli;
    }

    public Rule(String entity, int requestRateLimit, int requestRateWindow) {
        this.entity = entity;
        this.requestRateLimit = requestRateLimit;
        this.requestRateWindowMilli = requestRateWindow;
    }


    public String getEntity() {
        return entity;
    }
}
