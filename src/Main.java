import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    try {
        int hasil = Math.addExact(a, b);
        System.out.println(hasil);
    } catch (ArithmeticException e) {
        System.out.println("OVERFLOW");
    }

    float a = sc.nextFloat ();
    float b = sc.nextFloat ();
    
    }
}
