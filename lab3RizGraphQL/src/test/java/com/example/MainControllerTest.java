package com.example;

import com.example.graphqlserver.controller.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MainControllerTest {

    @Autowired
    private MainController mainController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(mainController).isNotNull();
    }
}
