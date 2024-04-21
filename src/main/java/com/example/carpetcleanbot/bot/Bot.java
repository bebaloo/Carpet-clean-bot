package com.example.carpetcleanbot.bot;

import com.example.carpetcleanbot.bot.configuration.BotProperties;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class Bot extends TelegramWebhookBot {
    private final BotProperties botProperties;

    public Bot(BotProperties botProperties) {
        super(botProperties.getToken());
        this.botProperties = botProperties;
    }

    @Override
    public BotApiMethod<?> onWebhookUpdateReceived(Update update) {
        return null;
    }

    @Override
    public String getBotPath() {
        return botProperties.getUrl();
    }

    @Override
    public String getBotUsername() {
        return botProperties.getUsername();
    }
}
