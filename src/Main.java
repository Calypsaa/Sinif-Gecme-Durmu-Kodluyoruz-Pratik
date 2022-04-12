import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, muzik;
        double average;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = scanner.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = scanner.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = scanner.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce = scanner.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik = scanner.nextInt();

        if (mat > 100 || mat < 0) {
            average = (fizik + kimya + turkce + muzik) / 4;
        } else if (fizik > 100 || fizik < 0) {
            average = (mat + kimya + turkce + muzik) / 4;
        } else if (kimya > 100 || kimya < 0) {
            average = (mat + fizik + turkce + muzik) / 4;
        } else if (turkce > 100 || turkce < 0) {
            average = (mat + fizik + kimya + muzik) / 4;
        } else if (muzik > 100 || muzik < 0) {
            average = (mat + fizik + turkce + kimya) / 4;
        } else {
            average = (mat + fizik + kimya + turkce + muzik) / 5;
        }
        if (average < 55) {
            System.out.println("Kaldınız. Seneye görüşmek üzere");
        } else {
            System.out.println("Tebrikler geçtiniz");
        }
        System.out.print("Ortalamanız: " + average);

    }
}
