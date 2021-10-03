import java.util.Scanner;
public class doWhileMenu {
    public static void main(String[] args) {
        int channel; Scanner input = new Scanner(System.in);
        do{
            System.out.println("Pilihan Channel TV :\n1. RCTI\n2. SCTV\n3. NET TV");
                    System.out.println("lainnya untuk matikan TV\n Masukkan pilihan Anda : ");
            channel = input.nextInt();
            switch (channel) {
                case 1 -> System.out.println("Selamat menyaksikan RCTI OK.");
                case 2 -> System.out.println("SCTV satu untuk semua...");
                case 3 -> System.out.println("NET TV, Televisi masa kini...");
                default -> System.out.println("Anda mematikan TV.");
            }
        } while (channel > 0 && channel < 4);

        System.out.println("TV sudah mati.");
        }
}
