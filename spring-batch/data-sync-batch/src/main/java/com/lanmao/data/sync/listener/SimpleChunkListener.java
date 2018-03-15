package com.lanmao.data.sync.listener;

import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;

/**
 * 在 Chunk 开始之前(beforeChunk)，之后(afterChunk)和错误后(afterChunkError)触发
 */
public class SimpleChunkListener implements ChunkListener {

    @Override
    public void beforeChunk(ChunkContext context) {
        System.out.println("SimpleChunkListener.beforeChunk");
    }

    @Override
    public void afterChunk(ChunkContext context) {
        System.out.println("SimpleChunkListener.afterChunk");
    }

    @Override
    public void afterChunkError(ChunkContext context) {
        System.out.println("SimpleChunkListener.afterChunkError");
    }

}