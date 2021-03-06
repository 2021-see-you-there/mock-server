package com.seeyouthere.mockapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class LoginController {

    @PostMapping("/oauth/token")
    public String oauthToken(@RequestParam String code) {
        String data = "{\n"
            + "    \"token_type\":\"bearer\",\n"
            + "    \"access_token\":\"%s\",\n"
            + "    \"expires_in\":43199,\n"
            + "    \"refresh_token\":\"{REFRESH_TOKEN}\",\n"
            + "    \"refresh_token_expires_in\":25184000,\n"
            + "    \"scope\":\"account_email profile\"\n"
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
            + "        \"nickname\":\"???????????????\",\n"
            + "        \"thumbnail_image\":\"http://xxx.kakao.co.kr/.../aaa.jpg\",\n"
            + "        \"profile_image\":\"http://xxx.kakao.co.kr/.../bbb.jpg\",\n"
            + "        \"custom_field1\":\"23\",\n"
            + "        \"custom_field2\":\"???\"\n"
            + "    }\n"
            + "}";
        return String.format(message, data, data);
    }


}
