package com.sqap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * Created by Tarun Kumar Sukhu
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class SqapAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqapAdminApplication.class, args);
    }

}
