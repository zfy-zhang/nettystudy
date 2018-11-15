package com.vincent.protocol.response;

import com.vincent.protocol.Packet;
import lombok.Data;

import static com.vincent.protocol.command.Command.LOGIN_RESPONSE;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/10/31
 */
@Data
public class LoginResponsePacket extends Packet {
    private String userId;

    private String userName;

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGIN_RESPONSE;
    }
}


