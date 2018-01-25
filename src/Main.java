import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int x = scanner.nextInt();
        System.out.println("Podaj ilosc przedziałow: ");
        int y = scanner.nextInt();
        System.out.println("Podaj zakres liczb: ");
        int z = scanner.nextInt();
        System.out.println(z/y);

        if (z % y == 0) {
            menu.sprawdzPrzedzial();
        }

            else {
                System.out.println("Zakres nie da się podzielic na rownoliczna ilosc przedzialow, podaj inne wartosci i zacznij jeszcze raz.");
                menu.sprawdzPrzedzial();
            }

        /*for (int j = 0; j < y; j++) {
                if (z > j * przedzial + 1 && z < (j + 1) * przedzial) {
                    System.out.println("IIIIII");
                    tab[j] += 1;
                }
                }
            }
        }*/
        /*for (int i = 0; i < y; i++)
            System.out.println(tab[i]);*/
    }
}
