package Generics;

import java.util.WeakHashMap;

public class TestMain {
    public static void main(String[] args) {
        String[] word = {"bary","aad","c","ditle"};
        Pair<String> minmax = ArrayAlg.minmax(word);
        System.out.println("min = " + minmax.getFirst());
        System.out.println("max = " + minmax.getSecond());
        String middle = ArrAlg.getMiddle("JSON", "Q.", "Public","ll");
        System.out.println(middle);
        Number middle1 = ArrAlg.getMiddle(3.14, 1729, 0);
        System.out.println(middle1);
    }
}

class ArrayAlg{
    public static Pair<String> minmax(String[] a){
        if (a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min,max);
    }
}

class ArrAlg{
    public static <T> T getMiddle(T... a){
        return a[a.length / 2];
    }
}
