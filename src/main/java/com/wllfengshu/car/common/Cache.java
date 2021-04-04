package com.wllfengshu.car.common;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * 缓存
 *
 * @author chenghao
 */
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Cache {

    /**
     * 字典表缓存
     */
    public static final Map<String, String> DICT_MAP = new HashMap<>();
}
