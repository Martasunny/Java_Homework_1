//Посчитать и сохранить в n номер старшего 
//значащего бита выпавшего числа
import java.util.Random;
public class task_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int i;
        i = rnd.nextInt(0, 2000);
        int n = bit1(i);
        System.out.println(i);
        System.out.println(n);

    }

    static int bit1(int x) {
        int t = 1 << 30;
        while (x < t) t >>= 1;
        return t;
    }
}
