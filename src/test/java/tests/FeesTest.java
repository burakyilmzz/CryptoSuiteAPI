package tests;

import base.BaseTest;
import endpoints.FeesApi;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FeesTest extends BaseTest {

    FeesApi feesApi = new FeesApi();

    @Test
    public void testRecommendedFees() {
        var response = feesApi.getRecommendedFees();
        int fastestFee = response.jsonPath().getInt("fastestFee");

        assertThat(fastestFee, greaterThan(0));
    }
}
