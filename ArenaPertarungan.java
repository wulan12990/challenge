import java.util.Scanner;

public class ArenaPertarungan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Object musuh
        Musuh monster1 = new Slime();
        Naga monster2 = new Naga();

        boolean isBermain = true;

        System.out.println("=================================");
        System.out.println("   SELAMAT DATANG DI ARENA RPG");
        System.out.println("=================================");

        while (isBermain) {

            System.out.println("\nPilih Musuh:");
            System.out.println("1. Lawan Slime");
            System.out.println("2. Lawan Naga");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");

            int pilih = input.nextInt();

            switch (pilih) {

                case 1:
                    System.out.println("\n=== SLIME MUNCUL ===");

                    monster1.tampilkanInfo();
                    monster1.suaraKhas();
                    monster1.serangPemain();

                    // cek loot
                    if (monster1 instanceof BisaLoot) {
                        ((BisaLoot) monster1).jatuhkanItem();
                    }

                    break;

                case 2:
                    System.out.println("\n=== NAGA MUNCUL ===");

                    monster2.tampilkanInfo();
                    monster2.suaraKhas();
                    monster2.serangPemain();

                    // interface terbang
                    monster2.lepasLandas();
                    monster2.seranganUdara();

                    // loot
                    monster2.jatuhkanItem();

                    break;

                case 3:
                    System.out.println("\nTerima kasih sudah bermain!");
                    isBermain = false;
                    break;

                default:
                    System.out.println("\nPilihan tidak valid!");
            }
        }

        input.close();
    }
}
