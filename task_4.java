//Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

import java.util.Random;
public class task_4 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int i;
        i = rnd.nextInt(0, 2000);
        int n = bit1(i);
        System.out.println(i);
        System.out.println(n);
        int[] m2 = new int[Short.MAX_VALUE];
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n != 0) {
                m2[j] = j;
            }
        }

    }

    static int bit1(int x) {
        int t = 1 << 30;
        while (x < t) t >>= 1;
        return t;
    }
}

