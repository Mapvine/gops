package com.mapvine.gops.option.marker;

import com.mapvine.gops.option.failable.Fail;

/**
 * Signal an operation went as expected.
 */
public class Worked implements DidItWork {

    @Override
    public Fail getReason() {
        throw new UnsupportedOperationException("Cannot retrieve failure information on a successful operation");
    }

    @Override
    public String getDetail() {
        throw new UnsupportedOperationException("Cannot retrieve failure information on a successful operation");
    }

    @Override
    public Boolean isSuccess() {
        return true;
    }
}
