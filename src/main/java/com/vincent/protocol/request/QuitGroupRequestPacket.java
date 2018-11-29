package com.vincent.protocol.request;

import com.vincent.protocol.Packet;
import lombok.Data;

import static com.vincent.protocol.command.Command.QUIT_GROUP_REQUEST;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/29
 */
@Data
public class QuitGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return QUIT_GROUP_REQUEST;
    }
}

