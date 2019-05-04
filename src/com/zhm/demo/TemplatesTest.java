package com.zhm.demo;

import com.zhm.bean.Customer;

import java.util.ArrayList;

/**
 * @author shkstart
 * @date 2019/5/4 - 15:55
 */
public class TemplatesTest {
    //prsf：生成private static final
    private static final Customer CUST = new Customer();
    //psf：生成public static final
    public static final int NUM = 1;
    //psfi：生成public static final int
    public static final int NUM2 = 2;
    //psfs：生成public static final String
    public static final String STR = "china";



    public static void main(String[] args) {
        System.out.println("hello");
        String[] arr = new String[]{"tom", "jerry", "haha", "hehe"};
        //fori
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            System.out.println(o);
        }
        //list.fori正序
        for (int i = 0; i < list.size(); i++) {
            System.out.println();
        }
        //list.forr倒叙
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println();
        }

        //ifn或list.null
        if (list == null) {

        }
        //inn或list.nn
        if (list != null) {

        }
    }
}