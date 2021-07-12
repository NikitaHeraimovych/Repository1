package com.company.java.controller;

public interface RegexConstant {
    // Cyrillic name
    String REGEX_NAME_RUS = "[А-Я][а-я]{1,20}";
    // Latin name
    String REGEX_NAME_LAT = "[A-Z][a-z]{1,20}";
    // login
    String REGEX_LOGIN = "[A-Za-z0-9_-]{8,20}";
}
