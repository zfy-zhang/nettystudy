package com.vincent.serialize.iml;

import com.alibaba.fastjson.JSON;
import com.vincent.serialize.Serializer;
import com.vincent.serialize.SerializerAlgorithm;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/10/31
 */
public class JSONSerializer implements Serializer {

    @Override
    public byte getSerializerAlogrithm() {
        return SerializerAlgorithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {
        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }

}
