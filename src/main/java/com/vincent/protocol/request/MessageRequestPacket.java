package com.vincent.protocol.request;

import com.vincent.protocol.command.Packet;
import lombok.Data;

import static com.vincent.protocol.command.Command.MESSAGE_REQUEST;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/5
 */
@Data
public class MessageRequestPacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
