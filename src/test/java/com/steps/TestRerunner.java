package com.steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@C:\\Users\\Yuvaraj\\workspace\\SeacnerioOutline\\report\\creport.txt",
glue="com.steps",monochrome=true)
public class TestRerunner {

}
