package endpoints;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class FeesApi {
    public Response getRecommendedFees() {
        return get("/v1/fees/recommended");
    }
}
