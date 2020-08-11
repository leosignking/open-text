package org.opentext.consumer.service;

import org.apache.kafka.common.TopicPartition;
import org.opentext.consumer.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MessageSubscriberService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageSubscriberService.class);

    @KafkaListener(topics = Constants.TOPIC)
    public void topicConsume(String message) {
        LOGGER.info((String.format("#### -> Agent Topic Consumed message -> %s", message)));
    }

    public void consumeAllMessagesInTopic(String topic) {
        TopicPartition topicPartition = new TopicPartition(topic, 0);
        List<TopicPartition> partitions = Arrays.asList(topicPartition);

    }
}
