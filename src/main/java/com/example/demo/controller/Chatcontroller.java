package com.example.demo.controller;

import com.example.demo.model.chatmessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Chatcontroller {

    @MessageMapping("/sendmessage")
    @SendTo("/topic/messages")
    public chatmessage sendMessage(chatmessage message) {
        return message;
    }

    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }
}
