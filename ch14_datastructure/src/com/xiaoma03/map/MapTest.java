package com.xiaoma03.map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * ClassName: MapTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/30 14:17
 * @Version 1.0
 */
public class MapTest {
    @Test
    public void test1(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("AA",123);
    }

    @Test
    public void test2(){
        HashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("AA",123);
    }
}
