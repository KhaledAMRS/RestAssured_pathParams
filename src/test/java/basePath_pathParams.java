import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.Map;

public class basePath_pathParams {
    public static void main(String[] args) {

        Map pathParams = new HashMap<>();
        pathParams.put("booking", "booking");
        pathParams.put("bookId", "2");

        RestAssured
                .given()
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("{booking}/{bookId}")
                .pathParams(pathParams)
                .when()
                .get();
    }
}
