package com.imooc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map map = createMap();
        showMap5(map);
    }


    public static Map createMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("wang1",3);
        map.put("wang2",2);
        map.put("wang3",5);
        map.put("wang4",6);
        map.put("wang5",5);
        return map;
    }

    /**
     * keySet
     * @param map
     */
    public static void showMap1(Map<String,Integer> map){
        for (String key:map.keySet()) {
            System.out.println(key+"----"+map.get(key));
        }
    }

    /**
     * lambda表达式
     * @param map
     */
    public static void showMap2(Map<String,Integer> map){
        map.forEach((k,v)->{
            System.out.println(k+"--->"+v);
        });
    }

    /**
     * entrySet方法
     * @param map
     */
    public static void showMap3(Map<String,Integer> map){
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }
    }

    /**
     * values方法 只能取value
     * @param map
     */
    public static void showMap4(Map<String,Integer> map){
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }

    /**
     * 迭代器
     * @param map
     */
    public static void showMap5(Map<String,Integer> map){
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> next = it.next();
            System.out.println(next.getKey()+"--->"+next.getValue());
        }
    }
}
