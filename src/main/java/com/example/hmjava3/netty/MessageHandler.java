package com.example.hmjava3.netty;

import com.example.hmjava3.AbstractMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageHandler extends SimpleChannelInboundHandler<AbstractMessage> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx,
                                AbstractMessage abstractMessage) throws Exception {
        log.info("Received: {}", abstractMessage);
        ctx.writeAndFlush(abstractMessage);

    }
}
