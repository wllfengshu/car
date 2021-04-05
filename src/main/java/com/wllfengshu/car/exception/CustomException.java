package com.wllfengshu.car.exception;

/**
 * 自定义异常
 *
 * @author
 */
public class CustomException extends Exception {

    protected ExceptionName exceptionName;

    public enum ExceptionName {
        //没有权限
        UNAUTHENTICATED(401),
        //非法参数
        ILLEGAL_PARAM(400),

        //用户名或者密码不能为空
        NOTNULL_USERNAME_OR_PASSWORD(10001),
        //用户名或者密码错误
        INVALID_USERNAME_OR_PASSWORD(10002),
        //两次密码不一致
        THE_TWO_PASSWORDS_ARE_INCONSISTENT(10003),
        ;

        private int code;

        ExceptionName(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

    public CustomException(String message, ExceptionName exceptionName) {
        super(message);
        this.exceptionName = exceptionName;
    }

    public ExceptionName getExceptionName() {
        return exceptionName;
    }
}
