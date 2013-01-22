package com.mapvine.gops.option

import com.mapvine.gops.option.failable.Fail
import com.mapvine.gops.option.marker.DidItWork
import com.mapvine.gops.option.marker.DidNotWork
import com.mapvine.gops.option.marker.Worked

/**
 * Easy way to construct {@link DidItWork}. Allows code like:
 *
 * {@code Worked()}
 * {@code DidNotWork(Fail.INVALID, "Invalid")}
 */
class Markers {
    public static DidItWork Worked() {
        new Worked()
    }

    public static DidItWork DidNotWork(Fail failure, String message) {
        new DidNotWork(failure, message)
    }
}
