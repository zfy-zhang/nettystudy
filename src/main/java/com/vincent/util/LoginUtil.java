package com.vincent.util;

import com.vincent.attributes.Attributes;
import io.netty.channel.Channel;
import io.netty.util.Attribute;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/5
 */
public class LoginUtil {
    public static void markAsLogin(Channel channel) {
        channel.attr(Attributes.LOGIN).set(true);
    }

    public static boolean hasLogin(Channel channel) {
        Attribute<Boolean> loginAttr = channel.attr(Attributes.LOGIN);

        return loginAttr.get() != null;
    }
}
