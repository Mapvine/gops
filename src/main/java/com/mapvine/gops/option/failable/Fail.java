package com.mapvine.gops.option.failable;

public enum Fail {
    CONNECT_TIMEOUT(504),
    READ_TIMEOUT(598),
    SERVER_MISSING(503),
    NOT_FOUND(404),
    BAD_REQUEST(400),
    BAD_RESPONSE(400),
    INVALID_PARAMETERS(400),
    UNKNOWN(500),
    ACCESS_DENIED(403),
    // Next line FTW
    SUCCESS(200); // place holder

    private final Integer httpResponseCode;

    Fail(Integer httpResponseCodeIn) {
        httpResponseCode = httpResponseCodeIn;
    }

    public Integer getHttpResponseCode() {
        return httpResponseCode;
    }
}
