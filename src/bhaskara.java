import java.util.Locale;
import java.util.Scanner;

public class bhaskara {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double delta = B * B - 4 * A * C;

        if (A == 0 || delta < 0.0) {
            System.out.println("Impossivel calcular");
        }
            else{
                double r1 = (-B + Math.sqrt(delta)) / (2 * A);
                double r2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.printf("r1 = %.5f ", r1);
            System.out.printf("r2 =  %.5f = ", r2);


            }
        }
    }

