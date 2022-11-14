package com.example.javaroad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBasedInjection {
    private MessageService messageService;

    @Autowired
    public ConstructorBasedInjection(@Qualifier("TwitterService") MessageService messageService) {
        super();
        this.messageService = messageService;
    }
    public void processMsg(String message) {
        messageService.sendMsg(message);
    }
}
