class Pohon {
    String Nama;
    String WarnaDaun;
    String JenisAkar;
    boolean Berbuah;

   void tampilkanJenis() {
        System.out.println("Nama pohon ini adalah " + Nama);
    }

    void tampilkanWarnaDaun() {
        System.out.println("Daunnya berwarna " + WarnaDaun);
    }

    void tampilkanJenisAkar() {
        System.out.println("Akarnya berjenis " + JenisAkar);
    }

    void tampilkanBerbuah() {
        if (Berbuah) {
            System.out.println("Pohon ini berbuah.");
        } else {
            System.out.println("Pohon ini tidak berbuah.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Membuat objek pohon
        Pohon pohon1 = new Pohon();

        // Mengatur nilai properti pohon
        pohon1.Nama = "Mangga";
        pohon1.WarnaDaun = "Hijau";
        pohon1.JenisAkar = "Akar Tunggang";

        // Menampilkan informasi pohon
        System.out.println("Informasi Pohon: ");
        pohon1.tampilkanJenis();
        pohon1.tampilkanWarnaDaun();
        pohon1.tampilkanJenisAkar();
    }
}
