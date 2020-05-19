package com.geekbrains.java.generics;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.Serializable;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
/* 1 */
////        List<String>  list = new ArrayList<>();
////        list.add(10);
//        Box boxInt1 = new Box(100);
//        Box boxInt2 = new Box(200);
//        //...
//        boxInt1.setObj(500);
//        //...
//        if (boxInt1.getObj() instanceof Integer && boxInt2.getObj() instanceof Integer) {
//            int res = (Integer)boxInt1.getObj() + (Integer)boxInt2.getObj();
//            System.out.println(res);
//        }

/* 2 */
//        BoxGen<Integer> bgi1 = new BoxGen<>( 1000);
//        BoxGen<Integer> bgi2 = new BoxGen<>( 200);
//        bgi1.setObj("javajava");
//        int res = bgi1.getObj() + bgi2.getObj();
//
////        BoxGen<String> bgs = new BoxGen<>("Java-Java");

/* BoxWithNumbers */
//        BoxWithNumbers<Integer> bni1 = new BoxWithNumbers<>(1,2,3,4,5,6);
//        BoxWithNumbers<Integer> bni2 = new BoxWithNumbers<>(6,5,4,3,2,1);
//        System.out.println(bni1.avg());
//        System.out.println(bni2.avg());
/* BoxWithNumbers 2 */
//        float a = 0.7f;
//        float b = 0.0f;
//        for (int i = 0; i < 70; i++) {
//            b += 0.01f;
//        }
////        System.out.println(a == b);
//        System.out.println(Math.abs(a - b) < 0.0001f);
//        System.out.println(a);
//        System.out.println(b);
/* BoxWithNumbers 3 */
//        BoxWithNumbers<Integer> bni1 = new BoxWithNumbers<>(1,2,3,4,5,6);
//        BoxWithNumbers<Integer> bni2 = new BoxWithNumbers<>(6,5,4,3,2,1);
//        BoxWithNumbers<Float> bnf1 = new BoxWithNumbers<>(1.0f,2.0f,3.0f,4.0f,5.0f,6.0f);
////        System.out.println(bni1.avg());
////        System.out.println(bni2.avg());
////        System.out.println(bni1.equalsByAvg(bnf1));
//        System.out.println(bni1.getClass().getName());
//        System.out.println(bni2.getClass().getName());
//
/* BoxWithNumbers 4 */
//        List<Number> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println(sumListElements(numbers));
//
//        List<Number> listNums = new ArrayList<>();
//
//        List myList = new ArrayList(); //raw
//        BoxGen bg = new BoxGen(3);
//        BoxWithNumbers bn = new BoxWithNumbers();
//
//        List<Box> boxesList = new ArrayList<>();
//        Collections.sort(boxesList);

//        List<Square> squares = new ArrayList<>(Arrays.asList(new Square(10), new Square(20), new Square(2)));
//        System.out.println(squares);
//        Collections.sort(squares);
//        System.out.println(squares);

        List<String> stringList = new ArrayList<>(Arrays.asList("AAA", "B", "CCCC", "AA", "AAAAAAA", "BBB"));
        System.out.println(stringList);
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
//// --------- пример анонимного внутреннего класса
////        Serializable s = new Serializable() {
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {}
//        };
//        // public class MainApp$1 inplements Runnable {
//        //  @Override
//        //    public void run() {}
//        //  };
//        // Runnable r = new MainApp$1();
//        System.out.println(r.getClass().getName());
//        // s -> MainApp$2
//// ========= пример анонимного внутреннего класса

        System.out.println(stringList);


    }


    public static <T> T getFirstElementFromList(List<T> in) {
        return in.get(0);
    } //пример обобщенного метода


    public static double sumListElements(List<? extends Number> list) {
        double result = 0.0;
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i).doubleValue();
        }
        return result;
    }
}