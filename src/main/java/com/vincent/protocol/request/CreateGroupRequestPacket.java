package com.vincent.protocol.request;

import com.vincent.protocol.Packet;
import lombok.Data;

import java.util.List;

import static com.vincent.protocol.command.Command.CREATE_GROUP_REQUEST;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/15
 */
@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_REQUEST;
    }

}
