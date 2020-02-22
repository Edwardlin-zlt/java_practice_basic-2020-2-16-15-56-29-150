package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) {
        //分别用for循环、增强for循环、迭代器遍历并打印getNumbers返回的List
        List<Integer> ints = getNumbers();
        for (int i = 0; i < ints.size(); i++) {
            System.out.print(ints.get(i) + " ");
        }
        System.out.println("==========================");

        for (Integer i : ints) {
            System.out.print(i + " ");
        }
        System.out.println("==========================");

        Iterator<Integer> iterator = ints.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    /**
     * 创建一个List 然后在List中添加0到100整数
     */
    public static List<Integer> getNumbers() {
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ints.add(i);
        }
        return ints;
    }


}
