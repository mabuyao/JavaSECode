package com.xiaoma05.exer.exer3;

/**
 * ClassName: NoLifeValueException
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/18 10:52
 * @Version 1.0
 */
public class NoLifeValueException extends RuntimeException{
    static final long serialVersionUID = -70346939L;

    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }
}
