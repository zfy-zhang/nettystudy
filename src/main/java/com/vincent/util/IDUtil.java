package com.vincent.util;

import java.util.UUID;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/11/15
 */
public class IDUtil {
    public static String randomId() {
        return UUID.randomUUID().toString().split("-下·")[0];
    }
}
