package de.code.talks.spock.example

import spock.lang.Specification

/**
 * @author Niels Falk
 */
class FixtureMethodsExampleSpec extends Specification {

    def 'first scenario'() {
        println "FixtureMethods.first scenario"
        expect: true
    }

    def 'second scenario'() {
        println "FixtureMethods.second scenario"
        expect: true
    }
}
