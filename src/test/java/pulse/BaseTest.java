package pulse;


import com.intuit.karate.KarateOptions;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;


/**
 * @author kapilkapri on 06/10/19 - 11:28 PM
 * @project karate-demo
 */

@KarateOptions(tags = {"~@ignore"})
public abstract class BaseTest {



    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll executed");
    }

    @AfterAll
    static void tear() {
        System.out.println("@AfterAll executed");
    }

    @BeforeEach
    void setupThis() {
        System.out.println("@BeforeEach executed");
    }

    @Tag("DEV")
    @Test
    void testCalcOne() {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals(4, 2, 2);
    }

    @Tag("PROD")
    @Disabled
    @Test
    void testCalcTwo() {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals(6, 2, 3);
    }

    @AfterEach
    void tearThis() {
        System.out.println("@AfterEach executed");
    }
}
