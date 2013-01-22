package com.mapvine.gops.option

import com.mapvine.gops.option.failable.Fail
import com.mapvine.gops.option.failable.Failable
import com.mapvine.gops.option.failable.Failed
import com.mapvine.gops.option.failable.Success

/**
 * Easy way to construct {@link Failable}. Allows code like:
 *
 * {@code Success("test")}
 * {@code Failed(Fail.INVALID , "Invalid")}
 */
class Failables {
    public static Failable Failed(Fail reason, String detail) {
        new Failed(reason, detail)
    }

    public static Failable Succeeded(value) {
        new Success(value)
    }
}
