package com.seeyouthere.mockapi.controller;

import static org.junit.jupiter.api.Assertions.*;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class TransportControllerTest {

    @LocalServerPort
    int port;

    @BeforeEach
    public void setUp() {
        RestAssured.port = port;
    }

    @Test
    void subway() {
        String response = RestAssured.given()
            .contentType(MediaType.APPLICATION_XML_VALUE)
            .when()
            .get("/getPathInfoBySubway")
            .then().statusCode(200)
            .extract().asString();

        System.out.println(response);
    }

    @Test
    void bus() {
        String response = RestAssured.given()
            .contentType(MediaType.APPLICATION_XML_VALUE)
            .when()
            .get("/getPathInfoByBus")
            .then().statusCode(200)
            .extract().asString();

        System.out.println(response);
    }

    @Test
    void busAndSubway() {
        String response = RestAssured.given()
            .contentType(MediaType.APPLICATION_XML_VALUE)
            .when()
            .get("/getPathInfoByBusNSub")
            .then().statusCode(200)
            .extract().asString();

        System.out.println(response);
    }
}
