package com.vincent.protocol.response;

import com.vincent.protocol.Packet;
import lombok.Data;

import static com.vincent.protocol.command.Command.LOGOUT_RESPONSE;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/15
 */
@Data
public class LogoutResponsePacket extends Packet {

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGOUT_RESPONSE;
    }
}
