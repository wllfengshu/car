package com.wllfengshu.car.utils;

import com.wllfengshu.car.common.Constant;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 *
 * @author wangll
 */
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TimeUtil {

    /**
     * 判断两个时间是否是同一天
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean checkDateSameDay(@NonNull Date a,@NonNull Date b){
        SimpleDateFormat sdf = new SimpleDateFormat(Constant.FORMAT_DEFAULT);
        return sdf.format(a).substring(0,10).equals(sdf.format(b).substring(0,10));
    }
}
