package com.vincent.protocol.response;

import com.vincent.protocol.Packet;
import lombok.Data;

import static com.vincent.protocol.command.Command.JOIN_GROUP_RESPONSE;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/29
 */
@Data
public class JoinGroupResponsePacket extends Packet {
    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_RESPONSE;
    }
}

