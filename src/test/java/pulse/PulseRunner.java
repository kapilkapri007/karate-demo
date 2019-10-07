package pulse;

import com.intuit.karate.junit5.Karate;

class PulseRunner extends BaseTest {
    
    // this will run all *.feature files that exist in sub-directories
    // see https://github.com/intuit/karate#naming-conventions   
    @Karate.Test
    Karate testAll() {
        return new Karate().relativeTo(getClass());
    }


}
