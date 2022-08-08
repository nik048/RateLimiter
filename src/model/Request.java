package model;

public class Request {
    String requestEndPoint;
    String requestApiKey;

    public String getRequestEndPoint() {
        return requestEndPoint;
    }

    public String getRequestApiKey() {
        return requestApiKey;
    }

    public Request(String requestApiKey, String requestEndPoint) {
        this.requestEndPoint = requestEndPoint;
        this.requestApiKey = requestApiKey;
    }
}
