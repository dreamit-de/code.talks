package de.code.talks.spock.example

import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

/**
 * @author Niels Falk
 */
class FixtureMethodsExampleSpec extends Specification {

    @Shared
    @AutoCleanup("flush")
    def connection = new Connection().open()

    def 'first scenario'() {
        println "FixtureMethodsExampleSpec.first scenario"
        expect: true
    }

    def 'second scenario'() {
        println "FixtureMethodsExampleSpec.second scenario"
        expect: true
    }
}
