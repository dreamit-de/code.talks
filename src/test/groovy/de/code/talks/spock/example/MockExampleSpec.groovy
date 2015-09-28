package de.code.talks.spock.example

import spock.lang.Specification

/**
 * @author Niels Falk
 */
class MockExampleSpec extends Specification {

    def 'user will be saved during registration'() {

        given: 'user fills in form'

        when: 'user registers'

        then: 'user is saved'
    }
}
