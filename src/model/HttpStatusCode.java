package model;

public enum HttpStatusCode {
    HTTP_OK(200),
    HTTP_REDIRECT(301),
    HTTP_RATE_LIMIT_EXCEED(429);

    int code;
    HttpStatusCode(int code) {
        this.code = code;
    }
}
