import java.util.Scanner;
public class operatorTernary {
    public static void main(String[] args) {
        int pinjaman, persenBunga;
        Scanner input = new Scanner(System.in);
        System.out.println("Besar Pinjaman Rp. ? ");
        pinjaman = input.nextInt();
        if (pinjaman > 10000000) {
            persenBunga = 10;
        } else {
            persenBunga = 5;
        }
        System.out.println("Anda dibebani bunga Rp."+(pinjaman*persenBunga)/100);
        System.out.println("Dana yang harus Anda kembalikan Rp."+(pinjaman+(pinjaman*persenBunga)/100));
    }
}
