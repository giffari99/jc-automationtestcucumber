package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/main/resources/feature/01Login.feature",
        "src/main/resources/feature/02Recruitment.feature",
        "src/main/resources/feature/03RecruitmentAdmin.feature"},
        glue = "com.juaracoding",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}

