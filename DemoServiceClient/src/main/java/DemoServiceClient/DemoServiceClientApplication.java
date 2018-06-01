package DemoServiceClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceClientApplication.class, args);
    }
}
