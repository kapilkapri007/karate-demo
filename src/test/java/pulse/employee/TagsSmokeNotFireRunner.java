package pulse.employee;

import com.intuit.karate.junit5.Karate;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;

/**
 * @author kapilkapri on 07/10/19 - 2:33 AM
 * @project karate-demo
 */
public class TagsSmokeNotFireRunner {

    @BeforeAll
    public static void setup() {
        // skip 'callSingle' in karate-config.js
        System.setProperty("karate.env", "pre");
    }

    @Karate.Test
    Karate testTagsSmokeNotFire() {
        return new Karate().tags("@employee","~@fire").relativeTo(getClass());
    }
}
