package com.vincent.protocol.response;

import com.vincent.protocol.Packet;
import com.vincent.session.Session;
import lombok.Data;

import java.util.List;

import static com.vincent.protocol.command.Command.LIST_GROUP_MEMBERS_RESPONSE;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/29
 */
@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private List<Session> sessionList;

    @Override
    public Byte getCommand() {

        return LIST_GROUP_MEMBERS_RESPONSE;
    }
}

