package com.vincent.protocol.request;

import com.vincent.protocol.Packet;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.vincent.protocol.command.Command.MESSAGE_REQUEST;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/5
 */
@Data
@NoArgsConstructor
public class MessageRequestPacket extends Packet {

    private String message;

    public MessageRequestPacket(String message) {
        this.message = message;
    }

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
