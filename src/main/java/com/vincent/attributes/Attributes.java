package com.vincent.attributes;

import io.netty.util.AttributeKey;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/5
 */
public interface Attributes {
    AttributeKey<Boolean> LOGIN = AttributeKey.newInstance("login");
}
