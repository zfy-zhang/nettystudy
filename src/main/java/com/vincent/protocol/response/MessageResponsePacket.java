package com.vincent.protocol.response;

import com.vincent.protocol.Packet;
import lombok.Data;

import static com.vincent.protocol.command.Command.MESSAGE_RESPONSE;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/5
 */
@Data
public class MessageResponsePacket extends Packet {

    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE;
    }
}
