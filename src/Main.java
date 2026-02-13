import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String jenisSoal = sc.next();

        // Soal 1
        if (jenisSoal.equals("Soal1")) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            int hasil = a + b;

            if ((a > 0 && b > 0 && hasil < 0) ||
                (a < 0 && b < 0 && hasil > 0)) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println(hasil);
            }
        }

        // Soal 2
        else if (jenisSoal.equals("Soal2")) {

            float xFloat = sc.nextFloat();
            float yFloat = sc.nextFloat();

            double xDouble = (double) xFloat;
            double yDouble = (double) yFloat;

            float jumlahFloat = xFloat + yFloat;
            double jumlahDouble = xDouble + yDouble;

            double selisih = Math.abs(jumlahFloat - jumlahDouble);

            System.out.printf("%.6f\n", selisih);
        }

        // Soal 3
        else if (jenisSoal.equals("Soal3")) {

            int N = sc.nextInt();

            Integer a = N;
            Integer b = a;

            a = a + 1;

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        // Soal 4
        else if (jenisSoal.equals("Soal4")) {

            String S = sc.next();

            String a = S;
            String b = new String(S);

            a = a + "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        // Soal 5
        else if (jenisSoal.equals("Soal5")) {

            int angkaInt = sc.nextInt();
            double angkaDouble = sc.nextDouble();
            boolean nilaiBoolean = sc.nextBoolean();

            double hasil = angkaInt * angkaDouble;

            if (!nilaiBoolean) {
                hasil = hasil * -1;
            }

            System.out.printf("%.2f\n", hasil);
        }

        sc.close();
    }
}
