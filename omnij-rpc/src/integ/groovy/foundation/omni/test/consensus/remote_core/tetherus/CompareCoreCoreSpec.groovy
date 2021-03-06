package foundation.omni.test.consensus.remote_core.tetherus

import foundation.omni.test.consensus.remote_core.CompareCoreCoreBaseSpec
import spock.lang.Ignore
import spock.lang.Title

import static foundation.omni.CurrencyID.USDT

/**
 * Local Omni Core vs Remote Omni Core consensus comparison for <code>TetherUS</code>
 */
@Ignore("Remote core server is down")
@Title("Compare Omni Core vs. Remote Omni Core (e.g. stable/last revision)")
class CompareCoreCoreSpec extends CompareCoreCoreBaseSpec {

    void setupSpec() {
        setupCoreCoreComparisonForCurrency(USDT)
    }
}
