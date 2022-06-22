package hr.hsnopek.springbootreacttraditionaltomcat;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Profile;

import java.io.File;
import java.util.Properties;

@Profile("!dev")
@Slf4j
public class ServletInitializer extends SpringBootServletInitializer {

    //  you can set external property file location through setenv.bat in tomcat/bin directory like so:

    //  set "JAVA_OPTS=-Dspring-boot-react-traditional-tomcat.external-properties-path=file:///D:/spring-boot-react-traditional-tomcat/application.properties"
    //  exit /b 0

    // where first part of the property is app name (in case there are multiple apps hosted on same tomcat server)

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        String externalPropertyFilePath = System.getProperty("spring-boot-react-traditional-tomcat.external-properties-path");
        log.info("External property path: {}","spring-boot-react-traditional-tomcat.external-properties-path");
        if(StringUtils.isNotBlank(externalPropertyFilePath)) {
            Properties props = new Properties();
            props.setProperty("spring.config.additional-location", externalPropertyFilePath);
            application.application().setDefaultProperties(props);
        } else {
            log.info("Property 'spring-boot-react-traditional-tomcat.external-properties-path' not found. " +
                    "No external application property file location will be set.");
        }
        return application.sources(SpringBootReactTraditionalTomcatApplication.class);
    }
}
