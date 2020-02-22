package com.thoughtworks.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(randomNumber());
    }

    /**
     *  生成10个0到20的随机整数，要求不能重复
     */
    public static Collection<Integer> randomNumber() {
        Random random = new Random();
        Set<Integer> integers = new HashSet<>();
        while (integers.size()< 10) {
            integers.add(random.nextInt(20));
        }
        return integers;
    }
}
