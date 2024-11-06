package com.juaracoding.utils;

public enum ScenarioTest {

    // T1 - T1000
    // feature Login
    T1("Success login with valid credentials"),
    T2("Invalid login with invalid credentials"),
    // feature recruitment candidate
    T3("Admin add new candidate"),
    // feature recruitment admin
    T4("Admin add new Admin");

    private String scenarioTestName;

    ScenarioTest(String value){
        scenarioTestName = value;

    }

    public String getScenarioTestName(){

        return scenarioTestName;

    }


}
