import java.util.Scanner;
public class whileDuaPangkat {
    public static void main(String[] args) {
        int pangkat, angka = 1, count = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan pangkat (pangkat \u2265 0)= ");
        pangkat = input.nextInt();
        while (count <= pangkat) {
            angka *= 2;
            count++;
        }
        System.out.println("2 pangkat "+pangkat+" = "+angka);
    }
}
