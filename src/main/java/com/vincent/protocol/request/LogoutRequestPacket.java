package com.vincent.protocol.request;

import com.vincent.protocol.Packet;
import lombok.Data;

import static com.vincent.protocol.command.Command.LOGOUT_REQUEST;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/15
 */
@Data
public class LogoutRequestPacket extends Packet {
    @Override
    public Byte getCommand() {

        return LOGOUT_REQUEST;
    }
}
