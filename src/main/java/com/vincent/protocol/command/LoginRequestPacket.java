package com.vincent.protocol.command;

import lombok.Data;

import static com.vincent.protocol.command.Command.LOGIN_REQUEST;


/**
 * Created with IDEA
 * author:vincent
 * Date:2018/10/31
 */
@Data
public class LoginRequestPacket extends Packet {

    private Integer userId;

    private String username;

    private String password;


    @Override
    public Byte getCommmand() {
        return LOGIN_REQUEST;
    }
}
