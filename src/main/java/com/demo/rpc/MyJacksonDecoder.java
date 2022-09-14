package com.demo.rpc;

import feign.Response;
import feign.jackson.JacksonDecoder;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;

public class MyJacksonDecoder extends JacksonDecoder {

    @Override
    public Object decode(Response response, Type type) throws IOException {
        if (response.body() == null) {
            return null;
        }
        if (type == String.class) {
            return StreamUtils.copyToString(response.body().asInputStream(), StandardCharsets.UTF_8);
        }
        return super.decode(response, type);
    }

}