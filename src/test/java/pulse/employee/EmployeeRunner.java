package pulse.employee;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit5.Karate;

/**
 * @author kapilkapri on 07/10/19 - 1:22 AM
 * @project karate-demo
 */

@KarateOptions(features = {
        "classpath:pulse/employee/employee-get.feature"}, tags = "@employee")
public class EmployeeRunner {
    @Karate.Test
    Karate testEmloyee() {
        return new Karate().relativeTo(getClass());
    }
}
