import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("n1 Sayısını Giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 Sayısını Giriniz: ");
        int n2 = input.nextInt();

        int ebob = 0 ;

        if (n1<n2) {
            for (int i = 1 ; i<=n1 ; i++) {

                if ((n1 % i ==0) && (n2 % i == 0)) {
                    ebob = i ;
                }
            }
            System.out.println("İki Sayının EBOBU: " + ebob);

            int ekok = (n1*n2) / ebob ;

            System.out.println("İki Sayının EKOKU: " + ekok);

        } else if (n2<n1) {
            for (int i = 1 ; i<=n2 ; i++) {

                if ((n1 % i ==0) && (n2 % i == 0)) {
                    ebob = i ;
                }
            }
            System.out.println("İki Sayının EBOBU: " + ebob);

            int ekok = (n1*n2) / ebob ;

            System.out.println("İki Sayının EKOKU: " + ekok);
        }
    }
}
