package com.steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\jacki\\git\\FirstTry\\src\\test\\resources\\features\\log.feature",
glue="com.steps",monochrome=true,dryRun=false,strict=true,
plugin={"html:report\\creport","json:report\\creport.json","rerun:report\\creport.txt"})
public class TestRunner {	
}
