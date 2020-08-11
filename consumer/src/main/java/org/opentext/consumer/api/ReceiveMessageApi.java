package org.opentext.consumer.api;

import org.opentext.consumer.service.MessageSubscriberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/message")
public class ReceiveMessageApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReceiveMessageApi.class);

    private final MessageSubscriberService messageService;

    ReceiveMessageApi(MessageSubscriberService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("{id}")
    public void fetchMessage(@PathVariable("id") String id) {
        this.messageService.topicConsume(id);
    }

    public void fetchAllMessage() {

    }
}
