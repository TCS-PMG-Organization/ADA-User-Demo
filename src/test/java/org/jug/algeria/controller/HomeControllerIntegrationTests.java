package org.jug.algeria.controller;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class HomeControllerIntegrationTests {

  RestTemplate restTemplate = new RestTemplate();

  @Test
	void contextLoads() {
	}
}
