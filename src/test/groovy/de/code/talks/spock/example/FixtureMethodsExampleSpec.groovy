package de.code.talks.spock.example

import spock.lang.Specification

/**
 * @author Niels Falk
 */
class FixtureMethodsExampleSpec extends Specification {

    def 'first scenario'() {
        println "FixtureMethodsExampleSpec.first scenario"
        expect: true
    }

    def 'second scenario'() {
        println "FixtureMethodsExampleSpec.second scenario"
        expect: true
    }
}
