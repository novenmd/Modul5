import librarysystem.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Perpustakaan perpustakaan =  new Perpustakaan();
        Buku buku1 = new Buku("Belantik", "Ahmad Tohari", 2001);
        Buku buku2 = new Buku("Bumi Manusia", "Pramoedya Ananta", 1980);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tampilkanBuku();

        User user1 = new User("Noven", 1010);
        user1.pinjamBuku(buku2);
        user1.kembalikanBuku(buku2);
    }
}
