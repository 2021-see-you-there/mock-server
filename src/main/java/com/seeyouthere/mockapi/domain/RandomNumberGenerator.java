package com.seeyouthere.mockapi.domain;

public class RandomNumberGenerator {

    private RandomNumberGenerator() {}

    public static String getX() {
        return String.valueOf(127 + Math.random());
    }

    public static String getY() {
        return String.valueOf(35 + Math.random());
    }
}
