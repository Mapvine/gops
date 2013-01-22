package com.mapvine.gops.option

import com.mapvine.gops.option.box.Box
import com.mapvine.gops.option.box.None
import com.mapvine.gops.option.box.Some

/**
 * Easy way to construct boxes. Allows code like:
 *
 * {@code Some("test")}
 * {@code None()}
 */
class Boxes {
    public static Box Some(value) {
        new Some(value)
    }

    public static Box None() {
        new None()
    }
}
