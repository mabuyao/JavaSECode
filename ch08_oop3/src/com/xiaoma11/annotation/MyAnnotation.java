package com.xiaoma11.annotation;

/**
 * ClassName: MyAnnotation
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/16 15:31
 * @Version 1.0
 */
public @interface MyAnnotation {
    String value() default "hello";
}
