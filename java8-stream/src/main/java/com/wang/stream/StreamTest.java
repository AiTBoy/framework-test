package com.wang.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    @Test
    public void test0(){
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4, 5, 6);

        // 过滤
        Stream<Integer> integerStream = numbers.stream().filter(num -> num > 3).distinct();
        System.out.println(integerStream);

        // 映射
        numbers.stream().filter(num -> num > 3).map(i -> numbers.get(i)).collect(Collectors.toList());
    }

    @Test
    public void test1(){
        System.out.println("===========first test==========");
    }

    @Test
    public void test2(){
        System.out.println("==========second test==========");
    }

}
