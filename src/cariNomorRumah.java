import java.util.Scanner;
public class cariNomorRumah {
    public static void main(String[] args) {
        int nomorYangDicari, nomorUrut;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nomor rumah yang Anda cari (1 s.d 50): ");
        nomorYangDicari = input.nextInt();
        nomorUrut = 0;
        while (nomorUrut < 50) {
            System.out.print(nomorUrut+" --> ");
            if (nomorUrut == nomorYangDicari) {
                System.out.println("KETEMU"); break;
            } else System.out.println("bukan");
            nomorUrut++;
        }
    }
}
