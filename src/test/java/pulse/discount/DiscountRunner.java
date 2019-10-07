package pulse.discount;

import com.intuit.karate.junit5.Karate;

class DiscountRunner {
    
    @Karate.Test
    Karate testDiscount() {
        return new Karate()
                .feature("discount")
                .relativeTo(getClass());
    }

}
