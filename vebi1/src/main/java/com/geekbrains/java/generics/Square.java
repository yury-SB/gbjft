package com.geekbrains.java.generics;

public class Square implements Comparable<Square> {
   private int area;

    public Square(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format("Box [%d]", area);
    }

//    @Override
//    public  int compareTo(Object o) {
//        Square another = (Square)o;
////        if(this.area > another.area) {
///* вариант для сравнения 1 */
////            return 1;
////        }
////        if (this.area < another.area) {
////            return -1;
////        }
////        return 0;
//
///* вариант для сравнения 2 */
//         return this.area - another.area;
//    }
    @Override
    public int compareTo(Square o) {
        return this.area - o.area;
    }
}

