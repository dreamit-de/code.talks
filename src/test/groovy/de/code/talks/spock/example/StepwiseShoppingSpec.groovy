package de.code.talks.spock.example

import spock.lang.Specification
import spock.lang.Stepwise

/**
 * @author Niels Falk
 */
@Stepwise
class StepwiseShoppingSpec extends Specification {

    def 'an unknown user adds a product to cart'() {
        given: 'user is on product view'
        when: 'he ads a guitar to his cart'
        then: 'cart with 1 product is displayed in the header'
        and: 'price of the cart equals guitar price'
    }

    def 'checkout requires login or registration'() {
        when: 'the unknown user tries clicks the checkout button'
        then: 'the login/registration dialog is shown'
        false
    }

    def 'user can a register and will be logged in'() {
        when: 'the user fills the signup form'
        and: 'hits the submit button'
        then: 'he is logged in'
    }
}
