package info.jab.ms.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MyEndpointE2ETest {

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    int randomServerPort;

    @Test
    void should_work_sequential_execution() throws Exception {
        final String baseUrl = "http://localhost:" + randomServerPort + "/v1/demo";

        ResponseEntity<List<String>> response = this.restTemplate.exchange(
            baseUrl,
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<>() {});
            
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().size()).isGreaterThan(0);
    }

}