package de.code.talks.spock.example

import spock.lang.Specification

/**
 * @author Niels Falk
 */
class MockExampleSpec extends Specification {

    def 'should register user'() {

        given: 'user fills in form'

        when: 'user registers'

        then: 'user is saved'
    }
}
