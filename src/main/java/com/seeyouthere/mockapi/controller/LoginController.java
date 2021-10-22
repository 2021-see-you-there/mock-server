package com.seeyouthere.mockapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/oauth/token")
    public String oauthToken(@RequestParam String code) {
        String data = "{\n"
            + "    \"access_token\":\"%s\"\n"
            + "}";
        return String.format(data, code);
    }

    @PostMapping("/v2/user/me")
    public String userToken(@RequestHeader String authorization) {
        String data = authorization.split(" ")[1];

        String message = "{\n"
            + "    \"id\":%s,\n"
            + "    \"kakao_account\": { \n"
            + "        \"profile_needs_agreement\": false,\n"
            + "        \"profile\": {\n"
            + "            \"nickname\": \"%s\",\n"
            + "            \"thumbnail_image_url\": \"http://yyy.kakao.com/.../img_110x110.jpg\",\n"
            + "            \"profile_image_url\": \"http://yyy.kakao.com/dn/.../img_640x640.jpg\",\n"
            + "            \"is_default_image\":false\n"
            + "        },\n"
            + "        \"email_needs_agreement\":false, \n"
            + "        \"is_email_valid\": true,   \n"
            + "        \"is_email_verified\": true,   \n"
            + "        \"email\": \"sample@sample.com\",\n"
            + "        \"age_range_needs_agreement\":false,\n"
            + "        \"age_range\":\"20~29\",\n"
            + "        \"birthday_needs_agreement\":false,\n"
            + "        \"birthday\":\"1130\",\n"
            + "        \"gender_needs_agreement\":false,\n"
            + "        \"gender\":\"female\"\n"
            + "    },  \n"
            + "    \"properties\":{\n"
            + "        \"nickname\":\"홍길동카톡\",\n"
            + "        \"thumbnail_image\":\"http://xxx.kakao.co.kr/.../aaa.jpg\",\n"
            + "        \"profile_image\":\"http://xxx.kakao.co.kr/.../bbb.jpg\",\n"
            + "        \"custom_field1\":\"23\",\n"
            + "        \"custom_field2\":\"여\"\n"
            + "    }\n"
            + "}";
        return String.format(message, data, data);
    }


}
