package com.wllfengshu.car.security;

import com.wllfengshu.car.model.vo.SessionVO;
import com.wllfengshu.car.utils.TimeUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 已登陆的用户管理
 * 注意：
 * 1、本系统为了追求简单，暂时不使用Redis，直接使用内存来管理session
 * 2、由于以上原因本系统不支持集群部署
 * 3、该session只是一个抽象的概念
 * 4、没有做心跳，所以该系统严格来说并不安全
 *
 * @author wangll
 * @date 2021-04-05 1:38
 */
public class LoggedUser {

    private static final Map<String, SessionVO> LOGGED_USER_MAP = new HashMap<>(1);

    public static boolean hasLogin(String sessionId) {
        SessionVO sessionVO = LOGGED_USER_MAP.get(sessionId);
        if (null == sessionVO) {
            return false;
        }
        if (TimeUtil.checkDateSameDay(sessionVO.getCreateTime(), new Date())) {
            return false;
        }
        return true;
    }

    public static synchronized void login(SessionVO sessionVO) {
        if (!hasLogin(sessionVO.getSessionId())) {
            LOGGED_USER_MAP.put(sessionVO.getSessionId(),sessionVO);
        }
    }

    public static synchronized void logout(String sessionId) {
        LOGGED_USER_MAP.remove(sessionId);
    }
}
