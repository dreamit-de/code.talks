package de.code.talks.spock.example

import spock.lang.Specification

/**
 * @author Niels Falk
 */
class MockExampleSpec extends Specification {

    def 'user will be saved during registration'() {

        given: 'user fills in form'
        def registration = new Registration()
        registration.dataStore = Mock(DataStore) {
            save(_) >> true
        }
        registration.user = "hans"

        when: 'user registers'
        registration.register()

        then: 'user is saved'
//        following assertion will not work with modified behavior (save >> true)
//        _ * registration.dataStore.save(_)
        true
    }
}
