package de.eradszewski.fluxvideostreamservice;

import de.eradszewski.fluxvideostreamservice.config.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class WebflixStreamingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebflixStreamingServiceApplication.class, args);
    }
}
