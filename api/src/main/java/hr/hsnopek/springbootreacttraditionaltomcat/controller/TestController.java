package hr.hsnopek.springbootreacttraditionaltomcat.controller;

import hr.hsnopek.springbootreacttraditionaltomcat.configuration.ApplicationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final Environment environment;

    @GetMapping(value = "/api/v1/hello-world")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok(String.format("Hello world! Active profile is: %s",
                Arrays.stream(environment.getActiveProfiles()).findFirst().orElse("/")));
    }

    @GetMapping(value = "/api/v1/test-message")
    public ResponseEntity<String> testMessage(){
        return ResponseEntity.ok(ApplicationProperties.TEST_MESSAGE);
    }
}
