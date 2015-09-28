package de.code.talks.spock.example

import spock.lang.Specification

/**
 * @author Niels Falk
 */
class DetermineMaxSpec extends Specification {

    def 'should determine the maximum of two numbers'() {

        given: 'first number is 5, second number is 3'

        when: 'the maximum is determined'

        then: 'the maximum is 5'
    }
}
