package com.mapvine.gops.option.marker;

import com.mapvine.gops.option.failable.Fail;

/**
 * Signal that an operation did not work. Contains the {@link com.mapvine.gops.option.failable.Failed} instance
 * for interrogation.
 */
public class DidNotWork implements DidItWork {
    private final Fail failure;
    private final String reason;

    public DidNotWork(Fail failure, String reason) {
        this.failure = failure;
        this.reason = reason;
    }

    @Override
    public Fail getReason() {
        return failure;
    }

    @Override
    public String getDetail() {
        return reason;
    }

    @Override
    public Boolean isSuccess() {
        return false;
    }
}

