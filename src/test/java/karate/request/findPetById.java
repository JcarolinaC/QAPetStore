package karate.request;

import com.intuit.karate.junit5.Karate;



public class findPetById {

    @Karate.Test
    Karate testSample() {return Karate.run("classpath:karate/request/2FindPetByI.feature").relativeTo(getClass());
    }
}

