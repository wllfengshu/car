package com.wllfengshu.car.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.text.DecimalFormat;

/**
 * 字符串工具类
 *
 * @author wangll
 */
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StringUtil {

    /**
     * Double保留两位小数(四舍五入)，返回类型为 String
     */
    public static String retain2Decimal(Double d){
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(d);
    }
}
