package helloworld

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HelloController)
class HelloControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == true
    }
    
    void "test hello"() {
            when:
            controller.hello()
    
            then:
 //               response.text == 'Hello World!'
            response.text == 'hello'
    }
    
        void "test hello 2"() {
                when:
                controller.index()
        
                then:
//                response.redirectedUrl == '/helloworld/hello'
                response.text == 'Hello World!'
        }

        void "test hello 3"() {
                when:
                controller.hello()
        
                then:
                response.redirectedUrl == '/helloworld/hello'
//                response.text == 'Hello World!'
        }


}
