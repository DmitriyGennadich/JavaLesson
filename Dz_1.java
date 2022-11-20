// import java.util.Scanner;

public class Dz_1 {
    
    // 1 Вычислить n-ое треугольного число(сумма чисел от 1 до n)  
    /*
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n,  count = 0, sum = 0;
        System.out.println("Найти сумма от 1 до n");
        System.out.print("Введите n: ");
        n = iScanner.nextInt();
        iScanner.close();
        
        for (int i = 1; i <= n; i++) {
            
                count++;
                sum += i;
                System.out.print(i + " ");
            
        }
        System.out.println("\nКоличество: " + count);
        System.out.println("Сумма: " + sum);
    }
    */

    // n! (произведение чисел от 1 до n)
    /* 
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
           result = result * i;
        }
        return result;
    }
      */

    // 2 Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    /* 
    public static void main(String[] args) {
        System.out.println();
        System.out.println(doThree(11, 10));
      }

      static boolean doThree(int a, int b) {
        
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    */

    // 3 Написать метод, которому в качестве параметра передается целое число, 
    // метод должен напечатать в консоль, положительное ли число передали 
    // или отрицательное. Замечание: ноль считаем положительным числом.
    /*
    public static void main(String[] args) {
        
        Scanner iscanner = new Scanner(System.in);
        System.out.println("Введите число");
        int x = iscanner.nextInt();
        iscanner.close();
        
        if (x >= 0) {
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное!");
        }
    }
    */

    // 4 Написать метод, которому в качестве параметра передается целое число. 
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
   /* 
    public static void main(String[] args) {
        System.out.println(checkNegative(3) + "\n");
    }
    public static boolean checkNegative(int a){
        return a < 0;
    }
    */


    // 5 Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;
    
    /*
    public static void main(String[] args) {
        toString("Qwerty", 3);
    }
    
    public static void toString(String str, int n){
        for (int i = 1; i <= n; i++){
            System.out.println( i + ") " + str);
        }
    
    }
    */
}