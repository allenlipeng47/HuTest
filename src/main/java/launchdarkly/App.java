package launchdarkly;

import com.launchdarkly.client.LDClient;
import com.launchdarkly.client.LDUser;

import java.util.Arrays;

public class App {

    // https://app.launchdarkly.com/default/production/features/launch-testing-feature/variations
    public static void main(String[] args) throws Exception {
        LDClient ldClient = new LDClient("sdk-37040ff3-2287-44a2-82c8-91aca915427d");
        LDUser user = new LDUser.Builder("UNIQUE IDENTIFIER")
                .firstName("Bob")
                .lastName("Loblaw")
                .customString("groups", Arrays.asList("beta_testers"))
                .build();

        boolean showFeature = ldClient.boolVariation("launch-testing-feature", user, false);
        System.out.println(showFeature);

//        if (showFeature) {
//            System.out.println("Showing your feature");
//        } else {
//            System.out.println("Not showing your feature");
//        }
        ldClient.close();
    }

}
