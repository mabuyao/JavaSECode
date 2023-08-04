package com.xiaoma04.override.test2;

import com.xiaoma04.override.test1.Order;

/**
 * ClassName: SubOrder
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/4 14:20
 * @Version 1.0
 */
public class SubOrder extends Order {

    public void method(){
        orderProtested = 1;
        orderPublic = 1;

        methodProtected();
        methodPublic();

        //其余两个 private/缺省 类型无法访问
    }
}
