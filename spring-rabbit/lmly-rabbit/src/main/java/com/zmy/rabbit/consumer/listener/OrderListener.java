package com.zmy.rabbit.consumer.listener;

import com.zmy.rabbit.vo.OrderMessage;
import org.springframework.amqp.core.MessageProperties;

public class OrderListener extends AbstractListener<OrderMessage> {

    @Override
    public void onMessage(OrderMessage message, MessageProperties messageProperties) {
        logger.info("收到订单消息：{}", message);
    }
}
