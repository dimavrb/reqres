package reqres.tests;

import io.qameta.allure.restassured.AllureRestAssured;
import org.junit.jupiter.api.Test;
import reqres.models.LoginBodyModel;
import reqres.models.LoginResponseErrorModel;
import reqres.models.LoginResponseModel;
import reqres.models.RegisterSuccessModel;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static reqres.specs.LoginSpec.loginRequestSpec;

public class SmokeTest {

    @Test
    void successfulLogin() {
        LoginBodyModel rqData = new LoginBodyModel();
        String validLogin = "eve.holt@reqres.in";
        String validPassword = "cityslicka";
        rqData.setEmail(validLogin);
        rqData.setPassword(validPassword);
        LoginResponseModel response = step("Send login request", () -> given(loginRequestSpec)
                .filter(new AllureRestAssured())
                .body(rqData)
                .when()
                .post("/login")
                .then()
                .extract().as(LoginResponseModel.class));


        step("Check response", () -> assertEquals("QpwL5tke4Pnpja7X4", response.getToken()));

    }

    @Test
    void unsuccessfulLogin() {
        LoginBodyModel rqData = new LoginBodyModel();
        rqData.setEmail("eve.holt@reqres.in");
        LoginResponseErrorModel response = step("Send login request", () -> given(loginRequestSpec)
                .post("/login")
                .then()
                .extract().as(LoginResponseErrorModel.class));
        step("Check response", () -> assertEquals("Missing email or username", response.getError()));

    }


    @Test
    void successfulRegister() {
        LoginBodyModel rqData = new LoginBodyModel();
        rqData.setEmail("eve.holt@reqres.in");
        rqData.setPassword("pistol");
        RegisterSuccessModel response = step("Send login request", () -> given(loginRequestSpec)
                .body(rqData)
                .when()
                .post("/register")
                .then()
                .extract().as(RegisterSuccessModel.class));
        step("Check response", () -> assertEquals("QpwL5tke4Pnpja7X4", response.getToken()));

    }


    @Test
    void unsuccessfulRegisterWithoutPassword() {
        LoginBodyModel rqData = new LoginBodyModel();
        rqData.setEmail("sydney@fife");
        LoginResponseErrorModel response = step("Send login request", () -> given(loginRequestSpec)
                .log().all().when()
                .body(rqData)
                .when()
                .post("/register")
                .then()
                .extract().as(LoginResponseErrorModel.class));


        step("Check response", () -> assertEquals("Missing password", response.getError()));

    }

    @Test
    void unsuccessfulRegisterWithoutLogin() {
        LoginBodyModel rqData = new LoginBodyModel();
        rqData.setPassword("sydney");
        LoginResponseErrorModel response = step("Send login request", () -> given(loginRequestSpec)
                .log().all().when()
                .body(rqData)
                .when()
                .post("/register")
                .then()
                .extract().as(LoginResponseErrorModel.class));


        step("Check response", () -> assertEquals("Missing email or username", response.getError()));

    }

}
