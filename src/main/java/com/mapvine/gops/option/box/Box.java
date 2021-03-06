package com.mapvine.gops.option.box;

/**
 * Wrapped interface for a Box. Meant to be similar to a Scala Option
 * (see {@link http://en.wikipedia.org/wiki/Option_type}).
 * <p/>
 * A Box is either full or empty. If full, you can call .get() and retrieve the value. If empty,
 * calling .get() will throw an exception.
 */
public interface Box<T> {
    T get();

    Boolean isEmpty();
}
