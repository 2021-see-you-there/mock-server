package com.seeyouthere.mockapi.controller;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class LoginControllerTest {

    @LocalServerPort
    int port;

    @BeforeEach
    public void setUp() {
        RestAssured.port = port;
    }

    @Test
    void userToken() {
        String before = RestAssured.given()
            .when()
            .post("/oauth/token?code=12341234")
            .then().statusCode(200)
            .extract().asString();

        System.out.println(before);

        String data = before.split("\n")[1].split(":")[1];

        String response = RestAssured.given()
            .header("Authorization", "Bearer " + data)
            .when()
            .post("/v2/user/me")
            .then().statusCode(200)
            .extract().asString();

        System.out.println(response);
    }
}