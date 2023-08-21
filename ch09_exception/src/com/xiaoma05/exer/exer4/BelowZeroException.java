package com.xiaoma05.exer.exer4;

/**
 * ClassName: BelowZeroException
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/18 11:03
 * @Version 1.0
 */
public class BelowZeroException extends Exception{
    static final long serialVersionUID = -33874229948L;
    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }
}
