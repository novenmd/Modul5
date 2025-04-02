package librarysystem;

public class User {
    private String nama;
    private int idUser;
    
    public User(String nama, int idUser) {
        this.nama = nama;
        this.idUser = idUser;
    }

    public String getNama() {
        return nama;
    }

    public int getIdUser() {
        return idUser;
    }

    public void pinjamBuku(Buku buku) {
        if (!buku.isStatusDipinjam()) { 
            buku.pinjamBuku();
            System.out.println(nama + " (ID: " + idUser + ") telah meminjam buku: " + buku.getJudul());
        } else {
            System.out.println("Buku " + buku.getJudul() + " sudah dipinjam.");
        }
    }

    public void kembalikanBuku(Buku buku) {
        if (buku.isStatusDipinjam()) {
            buku.kembalikanBuku();
            System.out.println(nama + "(ID: " + idUser + ") telah mengembalikan buku: " + buku.getJudul());
        } else {
            System.out.println("Buku " + buku.getJudul() + " tidak dalam status dipinjam.");
        }
    }
}

