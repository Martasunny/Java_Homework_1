//Найти все кратные n числа в диапазоне от i 
//до Short.MAX_VALUE сохранить в массив m1
/**
 * task_3
 */
import java.util.Random;
public class task_3 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int i;
        i = rnd.nextInt(0, 2000);
        int n = bit1(i);
        System.out.println(i);
        System.out.println(n);
        int[] m1 = new int[Short.MAX_VALUE];
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[j] = j;
            }
        }

    }

    static int bit1(int x) {
        int t = 1 << 30;
        while (x < t) t >>= 1;
        return t;
    }
}
