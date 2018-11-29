package com.vincent.protocol.request;

import com.vincent.protocol.Packet;
import lombok.Data;

import static com.vincent.protocol.command.Command.JOIN_GROUP_REQUEST;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/29
 */
@Data
public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_REQUEST;
    }
}

