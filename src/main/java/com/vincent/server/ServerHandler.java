package com.vincent.server;

import com.vincent.protocol.request.LoginRequestPacket;
import com.vincent.protocol.command.Packet;
import com.vincent.protocol.command.PacketCodeC;
import com.vincent.protocol.request.MessageRequestPacket;
import com.vincent.protocol.response.LoginResponsePacket;
import com.vincent.protocol.response.MessageResponsePacket;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.Date;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/10/31
 */
public class ServerHandler  extends ChannelInboundHandlerAdapter {

    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        System.out.println(new Date() + ": 客户端开始登录……");
        ByteBuf requestByteBuf = (ByteBuf) msg;

        //解码
        Packet packet = PacketCodeC.INSTANCE.decode(requestByteBuf);
        // 判断是否是登录请求数据包
        if (packet instanceof LoginRequestPacket) {
            LoginRequestPacket loginRequestPacket = (LoginRequestPacket) packet;
            LoginResponsePacket loginResponsePacket = new LoginResponsePacket();

            loginResponsePacket.setVersion(packet.getVersion());
            if (valid(loginRequestPacket)) {
                // 校验成功
                loginResponsePacket.setSuccess(true);
                System.out.println(new Date() + ": 登录成功!");
            }else {
                // 校验失败
                loginResponsePacket.setReason("账号密码校验失败");
                loginResponsePacket.setSuccess(false);
                System.out.println(new Date() + ": 登录失败!");
            }

            // 编码
            ByteBuf responseByteBuf = PacketCodeC.INSTANCE.encode(ctx.alloc(), loginResponsePacket);
            ctx.channel().writeAndFlush(responseByteBuf);
        } else if (packet instanceof MessageRequestPacket) {
            // 客户端发来消息
            MessageRequestPacket messageRequestPacket = ((MessageRequestPacket) packet);

            MessageResponsePacket messageResponsePacket = new MessageResponsePacket();
            System.out.println(new Date() + ": 收到客户端消息: " + messageRequestPacket.getMessage());
            messageResponsePacket.setMessage("服务端回复【" + messageRequestPacket.getMessage() + "】");
            ByteBuf responseByteBuf = PacketCodeC.INSTANCE.encode(ctx.alloc(), messageResponsePacket);
            ctx.channel().writeAndFlush(responseByteBuf);
        }
    }

    private boolean valid(LoginRequestPacket loginRequestPacket) {
        return true;
    }


}