package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class webSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // Enables a simple in-memory message broker
        config.enableSimpleBroker("/topic"); // e.g., for messages to subscribers
        config.setApplicationDestinationPrefixes("/app"); // e.g., for messages from clients
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Register a WebSocket endpoint that clients will use to connect
        registry.addEndpoint("/ws")
                .setAllowedOriginPatterns("http://localhost:8080") // allow all origins (for dev)
                .withSockJS(); // fallback for browsers that don’t support native WebSocket
    }
}
