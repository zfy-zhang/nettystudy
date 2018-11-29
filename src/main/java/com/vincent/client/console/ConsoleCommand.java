package com.vincent.client.console;

import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/15
 */
public interface ConsoleCommand {
    void exec(Scanner scanner, Channel channel);
}
