package org.opentext.producer.api;

import org.opentext.producer.service.Producer;
import org.opentext.producer.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class SendMessageApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(SendMessageApi.class);

    private final Producer producer;

    SendMessageApi(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/send")
    public void sendMessage(@RequestParam(value = "send") String sendNo,
                            @RequestParam(value = "receive") String receiveNo,
                            @RequestBody Object message) {
        // String topic = sendNo + "_" + receiveNo;
        this.producer.sendMessage(Constants.TOPIC, message);
    }
}
