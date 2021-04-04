package com.wllfengshu.car.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.DecimalFormat;

/**
 * double序列化(保留两位小数)
 * 参考：https://blog.csdn.net/u012075238/article/details/84249973
 *
 * @author wangll
 */
public class DoubleSerializeUtil extends JsonSerializer<Double> {

    private static final DecimalFormat DF = new DecimalFormat("0.00");

    @Override
    public void serialize(Double arg0, JsonGenerator arg1, SerializerProvider arg2) throws IOException {
        if(arg0 != null) {
            arg1.writeNumber(DF.format(arg0));
        }
    }
}
