import java.util.Scanner;

public class Main {
    private static int number = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите требуемое количество чисел последовательности Фиббоначи" + "\n" + "После введения числа нажмите Enter");
        number = scanner.nextInt();
        Fibonnaci();
    }

    private static void Fibonnaci() {
        long n0 = 1;
        long n1 = 1;
        long n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= number; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }
}
