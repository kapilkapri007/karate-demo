package pulse.employee;

import com.intuit.karate.junit5.Karate;
import pulse.BaseTest;

/**
 * @author kapilkapri on 07/10/19 - 1:52 AM
 * @project karate-demo
 */
public class SampleTest extends BaseTest {

    @Karate.Test
    Karate testDiscountSample() {
        return new Karate().feature("employee-get").relativeTo(getClass());
    }

    @Karate.Test
    Karate testTags() {
        return new Karate().feature("employee-post").tags("@first").relativeTo(getClass());
    }

/*    @Karate.Test
    Karate testFullPath() {
        return new Karate()
                .feature("classpath:karate/tags.feature")
                .tags("@first");
    }*/

}
