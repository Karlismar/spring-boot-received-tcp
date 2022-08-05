package com.br.gateway.tcp.server.service.implementation;



import com.br.gateway.tcp.server.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageImplementation implements MessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageImplementation.class);

    @Override
    public byte[] processMessage(byte[] message) {
        String messageContent = new String(message);
        LOGGER.info("Receive message: {}", messageContent);
        String responseContent = String.format("Message \"%s\" is processed", messageContent);
        return responseContent.getBytes();
    }

}
