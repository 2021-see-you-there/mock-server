package com.seeyouthere.mockapi.controller;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LocationControllerTest {

    @LocalServerPort
    int port;

    @BeforeEach
    public void setUp() {
        RestAssured.port = port;
    }

    @Test
    void coordinate() {
        String response = RestAssured.given()
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .queryParam("query", "주소")
            .when()
            .get("/v2/local/search/address.json")
            .then().statusCode(200)
            .extract().asString();

        System.out.println(response);

    }

    @Test
    void location() {
        String response = RestAssured.given()
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .queryParam("x", "123.1231234134")
            .queryParam("y", "123.123123123123")
            .when()
            .get("/v2/local/geo/coord2regioncode.json")
            .then().statusCode(200)
            .extract().asString();

        System.out.println(response);
    }

    @Test
    void searchKeyword() {
        String response = RestAssured.given()
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .queryParam("query", "keyword")
            .when()
            .get("/v2/local/search/keyword.json")
            .then().statusCode(200)
            .extract().asString();

        System.out.println(response);
    }

    @Test
    void utilityResponse() {
        String response = RestAssured.given()
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .queryParam("x", "x")
            .queryParam("y", "y")
            .when()
            .get("/v2/local/search/category.json")
            .then().statusCode(200)
            .extract().asString();

        System.out.println(response);
    }
}