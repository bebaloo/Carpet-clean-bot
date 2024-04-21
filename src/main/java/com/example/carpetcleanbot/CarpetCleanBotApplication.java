package com.example.carpetcleanbot;

import com.example.carpetcleanbot.bot.configuration.BotProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(BotProperties.class)
public class CarpetCleanBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarpetCleanBotApplication.class, args);
    }

}
