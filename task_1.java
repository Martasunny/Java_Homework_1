//Выбросить случайное целое число в диапазоне 
//от 0 до 2000 и сохранить в i
/**
 * task_1
 */
import java.util.Random;
public class task_1 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int x;
        int i;
        i = rnd.nextInt(0, 2000);
        System.out.println(i);
    }
}