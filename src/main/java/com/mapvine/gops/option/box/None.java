package com.mapvine.gops.option.box;

/**
 * An empty Box.
 * <p/>
 * Calling .get() will throw an exception.
 */
public class None<T> implements Box<T> {

    @Override
    public T get() {
        throw new UnsupportedOperationException("Cannot resolve value on None");
    }

    @Override
    public Boolean isEmpty() {
        return true;
    }
}
