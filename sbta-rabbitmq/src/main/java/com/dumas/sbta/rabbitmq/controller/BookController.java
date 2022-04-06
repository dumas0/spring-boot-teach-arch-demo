package com.dumas.sbta.rabbitmq.controller;

import com.dumas.sbta.rabbitmq.config.RabbitMQConfig;
import com.dumas.sbta.rabbitmq.entity.Book;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dumas
 * @desc TODO
 * @date 2022/04/06 15:58
 */
@RestController
@RequestMapping(value = "/books")
public class BookController {
    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public BookController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    /**
     * this.rabbitTemplate.convertAndSend(RabbitMQConfig.DEFAULT_BOOK_QUEUE, book); 对应 {@link com.dumas.sbta.rabbitmq.handler.BookHandler#listenerAutoAck}
     * this.rabbitTemplate.convertAndSend(RabbitMQConfig.MANUAL_BOOK_QUEUE, book); 对应 {@link com.dumas.sbta.rabbitmq.handler.BookHandler#listenerManualAck}
     */
    @GetMapping
    public void defaultMessage(){
        Book book = new Book();book.setId("1");
        book.setName("一起来学Spring Boot");
        this.rabbitTemplate.convertAndSend(RabbitMQConfig.DEFAULT_BOOK_QUEUE, book);
        this.rabbitTemplate.convertAndSend(RabbitMQConfig.MANUAL_BOOK_QUEUE, book);
    }
}
