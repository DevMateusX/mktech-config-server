package br.com.mktech.mktechconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class MktechConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MktechConfigServerApplication.class, args);
    }

}
