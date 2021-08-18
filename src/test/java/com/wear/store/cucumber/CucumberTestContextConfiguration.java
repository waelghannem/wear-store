package com.wear.store.cucumber;

import com.wear.store.WearStoreApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = WearStoreApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
