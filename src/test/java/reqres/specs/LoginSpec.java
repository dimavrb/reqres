package reqres.specs;


import io.restassured.specification.RequestSpecification;
import reqres.tests.TestBase;

import static io.restassured.RestAssured.with;
import static io.restassured.http.ContentType.JSON;
import static reqres.helpers.CustomAllureListener.withCustomTemplates;

public class LoginSpec extends TestBase {
    public static RequestSpecification loginRequestSpec = with()
            .filter(withCustomTemplates())
            .log().uri()
            .log().method()
            .log().body()
            .contentType(JSON)
            .baseUri(config.getBaseUrl())
            .basePath(config.getBasePath());

}