package de.code.talks.spock.example

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author Niels Falk
 */
class DetermineMaxSpec extends Specification {
    private firstNumber
    private secondNumber
    private max

    def 'determine the maximum of two numbers'() {
        given:
        'first number is 5, second number is 3'()

        when:
        'the maximum is determined'()

        then:
        'the maximum is 5'()
    }

    def "the maximum is 5"() {
        assert this.max == 5
        true
    }

    def "first number is 5, second number is 3"() {
        firstNumber = 5
        secondNumber = 3
    }

    def "the maximum is determined"() {
        max = new Calculator().determineMax(this.firstNumber, this.secondNumber)
    }

    @Unroll
    def "the maximum of #first and #second should be #expectedResult"() {
        expect:
        new Calculator().determineMax(first, second) == expectedResult

        where:
        first | second || expectedResult
        5     | 3      || 5
        5     | 99     || 99
    }
}
