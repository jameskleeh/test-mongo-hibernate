package test

import grails.test.mixin.integration.Integration
import spock.lang.Specification
import test.mongo.hibernate.Test

@Integration
class TestIntegrationSpec extends Specification {

    void "test list works"() {
        when:
        Test.count()

        then:
        noExceptionThrown()
    }
}
