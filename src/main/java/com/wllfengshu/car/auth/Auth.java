package com.wllfengshu.car.auth;

import java.lang.annotation.*;

/**
 * 权限注解
 *
 * @author wangll
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Auth {
}