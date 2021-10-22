package com.seeyouthere.mockapi.domain;

public enum ResponseLocationExamples {
    COORDINATE("{\n"
        + "    \"documents\": [\n"
        + "        {\n"
        + "            \"address\": {\n"
        + "                \"address_name\": \"전남 순천시 부송동 100\",\n"
        + "                \"b_code\": \"4514013400\",\n"
        + "                \"h_code\": \"4514069000\",\n"
        + "                \"main_address_no\": \"100\",\n"
        + "                \"mountain_yn\": \"N\",\n"
        + "                \"region_1depth_name\": \"전남\",\n"
        + "                \"region_2depth_name\": \"순천시\",\n"
        + "                \"region_3depth_h_name\": \"삼성동\",\n"
        + "                \"region_3depth_name\": \"부송동\",\n"
        + "                \"sub_address_no\": \"\",\n"
        + "                \"x\": \"%s\",\n"
        + "                \"y\": \"%s\"\n"
        + "            },\n"
        + "            \"address_name\": \"전남 순천시 부송동 100\",\n"
        + "            \"address_type\": \"REGION_ADDR\",\n"
        + "            \"road_address\": null,\n"
        + "            \"x\": \"%s\",\n"
        + "            \"y\": \"%s\"\n"
        + "        }\n"
        + "    ],\n"
        + "    \"meta\": {\n"
        + "        \"is_end\": true,\n"
        + "        \"pageable_count\": 1,\n"
        + "        \"total_count\": 1\n"
        + "    }\n"
        + "}\n") {
            @Override
            public String getData() {
                String x = RandomNumberGenerator.getX();
                String y = RandomNumberGenerator.getY();
                return String.format(getMaterial(), x, y, x, y);
            }
        },
    LOCATION("{\n"
        + "    \"meta\": {\n"
        + "        \"total_count\": 1\n"
        + "    },\n"
        + "    \"documents\": [\n"
        + "        {\n"
        + "            \"region_type\": \"B\",\n"
        + "            \"code\": \"4113510900\",\n"
        + "            \"address_name\": \"경기도 성남시 분당구 삼평동\",\n"
        + "            \"region_1depth_name\": \"경기도\",\n"
        + "            \"region_2depth_name\": \"성남시 분당구\",\n"
        + "            \"region_3depth_name\": \"삼평동\",\n"
        + "            \"region_4depth_name\": \"\",\n"
        + "            \"x\": %s,\n"
        + "            \"y\": %s\n"
        + "        }\n"
        + "    ]\n"
        + "}\n"),
    KEYWORD("{\n"
        + "    \"documents\": [\n"
        + "        {\n"
        + "            \"address_name\": \"서울 강남구 삼성동 159\",\n"
        + "            \"category_group_code\": \"\",\n"
        + "            \"category_group_name\": \"\",\n"
        + "            \"category_name\": \"가정,생활 > 문구,사무용품 > 디자인문구 > 카카오프렌즈\",\n"
        + "            \"distance\": \"418\",\n"
        + "            \"id\": \"26338954\",\n"
        + "            \"phone\": \"02-6002-1880\",\n"
        + "            \"place_name\": \"카카오프렌즈 스타필드 코엑스몰점\",\n"
        + "            \"place_url\": \"http://place.map.kakao.com/26338954\",\n"
        + "            \"road_address_name\": \"서울 강남구 영동대로 513\",\n"
        + "            \"x\": \"%s\",\n"
        + "            \"y\": \"%s\"\n"
        + "        }\n"
        + "    ],\n"
        + "    \"meta\": {\n"
        + "        \"is_end\": true,\n"
        + "        \"pageable_count\": 1,\n"
        + "        \"same_name\": {\n"
        + "            \"keyword\": \"카카오프렌즈\",\n"
        + "            \"region\": [],\n"
        + "            \"selected_region\": \"\"\n"
        + "        },\n"
        + "        \"total_count\": 1\n"
        + "    }\n"
        + "}\n"),
        CATEGORY("{\n"
            + "    \"documents\": [\n"
            + "        {\n"
            + "            \"address_name\": \"서울 관악구 신림동 1467-10\",\n"
            + "            \"category_group_code\": \"SW8\",\n"
            + "            \"category_group_name\": \"지하철역\",\n"
            + "            \"category_name\": \"교통,수송 > 지하철,전철 > 수도권2호선\",\n"
            + "            \"distance\": \"6\",\n"
            + "            \"id\": \"21160540\",\n"
            + "            \"phone\": \"02-6110-2301\",\n"
            + "            \"place_name\": \"신림역 2호선\",\n"
            + "            \"place_url\": \"http://place.map.kakao.com/21160540\",\n"
            + "            \"road_address_name\": \"서울 관악구 남부순환로 지하 1614\",\n"
            + "            \"x\": \"%s\",\n"
            + "            \"y\": \"%s\"\n"
            + "        }\n"
            + "    ],\n"
            + "    \"meta\": {\n"
            + "        \"is_end\": true,\n"
            + "        \"pageable_count\": 1,\n"
            + "        \"same_name\": null,\n"
            + "        \"total_count\": 1\n"
            + "    }\n"
            + "}\n");

    private final String material;

    ResponseLocationExamples(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String getData() {
        String x = RandomNumberGenerator.getX();
        String y = RandomNumberGenerator.getY();
        return String.format(this.material,x, y);
    }
}
