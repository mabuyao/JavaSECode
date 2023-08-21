package com.xiaoma04._throw;

/**
 * ClassName: BelowZeroException
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/18 10:28
 * @Version 1.0
 */
public class BelowZeroException extends Exception{
    static final long serialVersionUID = -7034897196939L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
