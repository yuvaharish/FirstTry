package com.steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@C:\\Users\\jacki\\git\\FirstTry\\report\\creport.txt",
glue="com.steps",monochrome=true)
public class TestRerunner {

}
