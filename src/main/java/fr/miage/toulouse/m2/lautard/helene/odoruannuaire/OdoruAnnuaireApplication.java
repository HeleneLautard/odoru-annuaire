package fr.miage.toulouse.m2.lautard.helene.odoruannuaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OdoruAnnuaireApplication {

    public static void main(String[] args) {
        SpringApplication.run(OdoruAnnuaireApplication.class, args);
    }

}
