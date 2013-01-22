package com.mapvine.gops.option

import com.mapvine.gops.option.Markers
import com.mapvine.gops.option.failable.Fail
import spock.lang.Specification

class DidItWorkSpec extends Specification {
    def "test worked"() {
        expect:
        Markers.Worked().isSuccess()

        when:
        Markers.Worked().reason

        then:
        thrown(UnsupportedOperationException)

        when:
        Markers.Worked().detail

        then:
        thrown(UnsupportedOperationException)
    }

    def "test did not work"() {
        setup:
        def fail = Fail.ACCESS_DENIED
        def reason = "REASON"
        def unit = Markers.DidNotWork(fail, reason)

        expect:
        unit.reason == fail
        unit.detail == reason
        !unit.isSuccess()
    }
}
