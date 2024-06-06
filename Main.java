public class Main {
    public static void main(String[] args) {
        PriorityScheduler pEr = new PriorityScheduler();

        pEr.antrianPasien(1, "Nur Aisyah", "Biru", 30);
        pEr.antrianPasien(2, "Rima", "Merah", 20);
        pEr.antrianPasien(3, "Kira", "Hijau", 10);
        pEr.antrianPasien(4, "Didi", "Kuning", 5);
        pEr.antrianPasien(5, "Mila", "Biru", 65);

        System.out.print("Urutan Penanganan Pasien :");
        pEr.cetakDataPasien();    

    }
}
