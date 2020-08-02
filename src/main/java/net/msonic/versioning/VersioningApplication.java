package net.msonic.versioning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="net.msonic.versioning.*")
public class VersioningApplication {

    public static void main(String[] args) {
        SpringApplication.run(VersioningApplication.class, args);
    }

}
