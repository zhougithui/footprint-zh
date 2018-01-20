package com.zmy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.RedisNode;

import java.util.HashSet;

/**
 * redis哨兵节点初始化
 * @author hui.zhou 18:07 2018/1/4
 */
public class SentinelInitializer extends HashSet<RedisNode> {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public SentinelInitializer(String redisSentinels){
        try {
            for (String node : redisSentinels.split(";")){
                RedisNode redisNode = new RedisNode(node.split(":")[0], Integer.parseInt(node.split(":")[1]));
                this.add(redisNode);
            }
        } catch (Exception e) {
            logger.error("redis哨兵节点初始化失败", e);
            throw new IllegalArgumentException(e);
        }
    }
}
