import java.util.*;

public class Dz3 {

    // 1. Пусть дан произвольный список целых чисел, удалить из него четные числа

    /*
     * public static void main(String[] args) {
     * List<Integer> list = new ArrayList<Integer>();
     * 
     * list.add(1);
     * list.add(2);
     * list.add(3);
     * list.add(4);
     * list.add(6);
     * list.add(8);
     * 
     * Iterator<Integer> f = list.iterator();
     * while (f.hasNext()) {
     * Integer number = f.next();
     * if (number % 2 == 0) {
     * f.remove();
     * }
     * }
     * System.out.println("Отсортированный список " + list);
     * 
     * }
     */

    // 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и
    // среднее из этого списка.

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(21);
        list.add(110);
        double sum = 0;
        for (double number : list) {
            sum += number;
        }
        double midVal = Double.valueOf(sum / list.size());
        String mid = String.format("%.1f", midVal);

        System.out.println("Max = " + Collections.max(list));
        System.out.println("Min = " + Collections.min(list));
        System.out.println("Mid = " + mid);
    }
}
