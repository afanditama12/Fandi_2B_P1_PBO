import java.util.Scanner;
public class forDuaPangkat {
    public static void main(String[] args) {
        int pangkat, angka = 1, count;
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan pangkat (pangkat \u2265 0)= ");
        pangkat = input.nextInt();
        for (count = 0; count < pangkat; count++) {
            angka*=2;
        }
        System.out.println("2 pangkat "+pangkat+" = "+angka);
    }
}
