package reqres.tests;

import io.qameta.allure.Description;
import io.qameta.allure.restassured.AllureRestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import reqres.models.login.LoginRequestModel;
import reqres.models.login.LoginResponseErrorModel;
import reqres.models.login.LoginResponseModel;
import reqres.models.register.RegisterSuccessModel;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static reqres.specs.LoginSpec.loginRequestSpec;


@DisplayName("Проверка авторизации и регистрации пользователя")

public class AuthorizationTests {

    @Test
    @DisplayName("Успешная авторизация")
    @Description("Проверить, что авторизация с валидными данными, выполняется успешно")
    void successfulLogin() {
        LoginRequestModel rqData = new LoginRequestModel();
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
    @DisplayName("Авторизация без указания пароля")
    @Description("Проверить, что авторизация без указания password завершается с ошибкой")
    void unsuccessfulLogin() {
        LoginRequestModel rqData = new LoginRequestModel();
        rqData.setEmail("eve.holt@reqres.in");
        LoginResponseErrorModel response = step("Send login request", () -> given(loginRequestSpec)
                .post("/login")
                .then()
                .extract().as(LoginResponseErrorModel.class));
        step("Check response", () -> assertEquals("Missing email or username", response.getError()));

    }


    @Test
    @DisplayName("Регистрация пользователя с валидными данными")
    @Description("Проверить, что регистрация с валидными данными, завершается успешно. В ответе приходит токен пользователя")
    void successfulRegister() {
        LoginRequestModel rqData = new LoginRequestModel();
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
    @DisplayName("Регистрация пользователя без указания пароля")
    @Description("Проверить, что регистрация, без указания пароля, завершается ошибкой")
    void unsuccessfulRegisterWithoutPassword() {
        LoginRequestModel rqData = new LoginRequestModel();
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
    @DisplayName("Регистрация без указания логина")
    @Description("Проверить, что регистарция без указания логина, завершается ошибкой")
    void unsuccessfulRegisterWithoutLogin() {
        LoginRequestModel rqData = new LoginRequestModel();
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
