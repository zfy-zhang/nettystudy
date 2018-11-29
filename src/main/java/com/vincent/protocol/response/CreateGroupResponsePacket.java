package com.vincent.protocol.response;

import com.vincent.protocol.Packet;
import lombok.Data;

import java.util.List;

import static com.vincent.protocol.command.Command.CREATE_GROUP_RESPONSE;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/15
 */
@Data
public class CreateGroupResponsePacket extends Packet {
    private boolean success;

    private String groupId;

    private List<String> userNameList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_RESPONSE;
    }
}

