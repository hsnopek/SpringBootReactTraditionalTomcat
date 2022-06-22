package hr.hsnopek.springbootreacttraditionaltomcat.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {

    public static String FRONTEND_URL;
    public static String TEST_MESSAGE;

    @Value("${frontend.url}")
    public void setFrontendUrl(String frontendUrl) {
        ApplicationProperties.FRONTEND_URL = frontendUrl;
    }
    @Value("${test.message}")
    public void setTestMessage(String testMessage) {
        ApplicationProperties.TEST_MESSAGE = testMessage;
    }

}

