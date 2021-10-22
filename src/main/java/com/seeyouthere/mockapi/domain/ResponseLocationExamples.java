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
        + "}\n");

    private final String material;

    ResponseLocationExamples(String material) {
        this.material = material;
    }

    public String getCoordinate() {
        String x = RandomNumberGenerator.getX();
        String y = RandomNumberGenerator.getY();
        return String.format(this.material,x, y, x, y);
    }
}
