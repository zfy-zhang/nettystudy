package com.vincent.attributes;

import com.vincent.session.Session;
import io.netty.util.AttributeKey;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/5
 */
public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}

