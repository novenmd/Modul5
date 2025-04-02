package librarysystem;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku>  koleksiBuku; 

    public Perpustakaan() {
        koleksiBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
        System.out.println("Buku " + buku.getJudul() + " ditambahkan ke perpustakaan.");
    }

    public void tampilkanBuku() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (Buku buku : koleksiBuku) {
            System.out.println("- " + buku.getJudul() + " oleh " + buku.getPenulis() + " (" + buku.getTahunTerbit() + ")");
        }
    }
    public ArrayList<Buku> getKoleksiBuku() {
        return koleksiBuku;
    }
}

