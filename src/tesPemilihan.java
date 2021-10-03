import java.util.Scanner;
public class tesPemilihan {
    public static void main(String[] args) {
        int absen, persenTarget, gajiPokok, bonus;
        Scanner input = new Scanner(System.in);
        System.out.println("Dalam sebulan anda tidak masuk berapa kali ? ");
                absen = input.nextInt();
        System.out.println("Pencapaian target penjualan bulan ini (%)? ");
        persenTarget = input.nextInt();
        System.out.println("Gaji Pokok ? ");
        gajiPokok = input.nextInt();
        if(absen > 5)
            System.out.println("Siap-siap mendapat surat teguran !");
        if(persenTarget > 80){
            System.out.println("Anda mendapat bonus sebesar 10%");
            bonus = (gajiPokok * 10) / 100;
        } else if(persenTarget > 60) {
            System.out.println("Anda mendapat bonus sebesar 5%");
            bonus = (gajiPokok * 5) / 100;
        } else {
            System.out.println("Maaf Anda tidak mendapat bonus");
            bonus = 0;
        }
        System.out.println("Gaji yang Anda terima = "+(gajiPokok+bonus));


    }
}
