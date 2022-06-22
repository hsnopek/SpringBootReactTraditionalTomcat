package hr.hsnopek.springbootreacttraditionaltomcat;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@Slf4j
public class SpringBootReactTraditionalTomcatApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootReactTraditionalTomcatApplication.class)
                .build()
                .run(args);
    }

}
