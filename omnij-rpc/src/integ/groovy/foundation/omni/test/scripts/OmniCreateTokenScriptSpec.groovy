package foundation.omni.test.scripts

import foundation.omni.scripts.omniCreateToken
import spock.lang.Specification


/**
 * Just run the script and make sure its assert doesn't fail
 */
class OmniCreateTokenScriptSpec extends Specification {
    def "run the omniCreateToken.groovy script"() {
        expect:
        omniCreateToken.main()
    }

}