package com.wllfengshu.car.auth;

import com.wllfengshu.car.exception.CustomException;
import com.wllfengshu.car.security.LoggedUser;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 权限切面类
 *
 * @author wangll
 */
@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class AuthAspect {

    @Pointcut(value = "@annotation(auth)", argNames = "auth")
    private void authAround(Auth auth) {
    }

    @Around(value = "authAround(auth)", argNames = "joinPoint,auth")
    public Object doAuth(ProceedingJoinPoint joinPoint, Auth auth) throws Throwable {
        log.info("AuthAspect doAuto ---> 处理数据权限-开始");
        //1 获取权限需要的参数
        String[] paramNames = ((MethodSignature) joinPoint.getSignature()).getParameterNames();
        Object[] paramValues = joinPoint.getArgs();
        String sessionId = null;
        for (int i = 0; i < paramNames.length; i++) {
            if ("sessionId".equals(paramNames[i])){
                sessionId = paramValues[i].toString();
                break;
            }
        }
        //2 处理权限(暂时只校验sessionId是否合法)
        if (!LoggedUser.hasLogin(sessionId)) {
            throw new CustomException("没有权限", CustomException.ExceptionName.UNAUTHENTICATED);
        }
        log.info("AuthAspect doAuto ---> 处理数据权限-结束");
        return joinPoint.proceed();
    }
}
