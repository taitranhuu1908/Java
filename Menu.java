import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        boolean cont = true;
        Menu menu = new Menu();
        do {

            Menu();

            System.out.println("Choose: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    clrscr();
                    menu.CalculatorTheRectangle();
                    break;
                case 2:
                    clrscr();
                    menu.CalculatorTheSquare();
                    break;
                case 3:
                    clrscr();
                    menu.EvenOrOdd();
                    break;
                case 4:
                    clrscr();
                    menu.TotalNatural();
                    break;
                case 5:
                    clrscr();
                    menu.TotalEven();
                    break;
                case 6:
                    clrscr();
                    menu.TotalDivistor();
                    break;
                case 7:
                    clrscr();
                    menu.PerfectNumber();
                    break;
                case 8:
                    clrscr();
                    menu.PrimeNumber();
                    break;
                case 9:
                    clrscr();
                    menu.ListedPrimeNumber();
                    break;
                case 10:
                    clrscr();
                    menu.ListedPerfectNumber();
                    break;
                case 11:
                    clrscr();
                    menu.Power();
                    break;
                default:
                    System.out.println("██████╗  ██████╗  ██████╗ ██████╗ ██████╗ ██╗   ██╗███████╗██╗██╗██╗");
                    System.out.println("██╔════╝ ██╔═══██╗██╔═══██╗██╔══██╗██╔══██╗╚██╗ ██╔╝██╔════╝██║██║██║");
                    System.out.println("██║  ███╗██║   ██║██║   ██║██║  ██║██████╔╝ ╚████╔╝ █████╗  ██║██║██║");
                    System.out.println("██║   ██║██║   ██║██║   ██║██║  ██║██╔══██╗  ╚██╔╝  ██╔══╝  ╚═╝╚═╝╚═╝");
                    System.out.println("╚██████╔╝╚██████╔╝╚██████╔╝██████╔╝██████╔╝   ██║   ███████╗██╗██╗██╗");
                    System.out.println(" ╚═════╝  ╚═════╝  ╚═════╝ ╚═════╝ ╚═════╝    ╚═╝   ╚══════╝╚═╝╚═╝╚═╝");
                    cont = false;
                    break;

            }
        } while (cont);
    }

    public static void Menu() {
        System.out.println("███╗   ███╗███████╗███╗   ██╗██╗   ██╗");
        System.out.println("████╗ ████║██╔════╝████╗  ██║██║   ██║");
        System.out.println("██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║");
        System.out.println("██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║");
        System.out.println("██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝");
        System.out.println("╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝ ");

        System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
        System.out.println("2. Tính chu vi và diện tích hình vuông");
        System.out.println("3. Tính chu vi và diện tích hình vuông");
        System.out.println("4. S=1+2+3+4+...+n;");
        System.out.println("5. S = 2+4+6+...+n;");
        System.out.println("6. Tổng các ước số của n");
        System.out.println("7. Kiểm tra n là số hoàn hảo");
        System.out.println("8. Kiểm tra n là số nguyên tố");
        System.out.println("9. Liệt kê tất cả các số nguyên tố 1...n;");
        System.out.println("10. Liệt kê tất cả số hoàn hảo từ 1...n;");
        System.out.println("11. S= 1^1+2^2+3^3+...n^n;");
        System.out.println("12. Thoát.");
        System.out.println("---------------------Menu---------------------");

    }

    public void CalculatorTheRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length: ");
        float length = sc.nextFloat();
        System.out.println("Input width: ");
        float width = sc.nextFloat();
        System.out.println("- Chu vi hình chữ nhật:  " + (length + width) * 2);
        System.out.println("- Diện tích hình chữ nhật:  " + (length * width));
    }

    public void CalculatorTheSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input edge: ");
        float length = sc.nextFloat();
        System.out.println("- Chu vi hình vuông :" + (4 * length));
        System.out.println("- Diện tích hình vuông :" + (length * length));
    }

    public void EvenOrOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n:");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("--> n là số chẵn");
        } else
            System.out.println("--> n là số lẻ");
    }

    public void TotalNatural() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tổng = " + sum);
    }

    public void TotalEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn = " + sum);
    }

    public void TotalDivistor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println("---> Tổng các ước số = " + sum);

    }

    public void PerfectNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum - n == n) {
            System.out.println("-->" + n + " là số hoàn hảo");
        } else {
            System.out.println("--> n không phải là số hoàn hảo");
        }
    }

    public void PrimeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không phải là số nguyên tố");
        }
    }

    public void ListedPrimeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + " là số nguyên tố");
            }
        }
    }

    public void ListedPerfectNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum - i == i) {
                System.out.println(i + " là số hoàn hảo");
            }
        }
    }

    public void Power() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            int answer = 1;
            for (int j = 1; j <= i; j++) {
                answer *= i;
            }
            sum += answer;
        }
        System.out.println("Tổng Lũy thừa = " + sum);
    }

    public static void clrscr() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
        }
    }
}
