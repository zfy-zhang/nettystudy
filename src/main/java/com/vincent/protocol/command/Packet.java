package com.vincent.protocol.command;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/10/31
 */
@Data
public abstract class Packet {

    /**
     * 协议版本
     */
    private Byte version = 1;

    /**
     *  指令
     */
    public abstract Byte getCommmand();


}
