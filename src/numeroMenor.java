import java.util.Scanner;

public class numeroMenor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int menor = A;

        if (B<menor) {
        menor = B;}
5
        if (C<menor) {
            menor = C;}

       System.out.println("menor:" + menor);
        }

    }
