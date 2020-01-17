package com.xmustang.simplestartertest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.xmustang.simple.service.ExampleService;

@SpringBootTest
class SimpleStarterTestApplicationTests {

    @Autowired
    private ExampleService exampleService;

    @Test
    void contextLoads() {
        System.out.println(exampleService.wrap("hello"));
    }

}
