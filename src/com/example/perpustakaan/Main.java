package com.example.perpustakaan;

public class Main {

	public static void main(String[] args) {
		// Inisialisasi object Perpustakaan
		Perpustakaan perpus = new Perpustakaan();
		perpus.setStatus("BUKA");
		
		// Inisialisasi object Book
		Book buku1 = new Book("Sapiens", "Yuval Noah Harari", "Kepustakaan Populer Gramedia", "TERSEDIA");
		Book buku2 = new Book("The Stranger", "Albert Camus", "Mizan", "TERSEDIA");
		Book buku3 = new Book("Algoritma dan Pemrograman", "Rinaldi Munir, Leony Lidya", "Informatika Bandung", "TERSEDIA");
		
		// Menambahkan buku baru ke perpustakaan
		perpus.tambahBuku(buku1);
		perpus.tambahBuku(buku2);
		perpus.tambahBuku(buku3);
		
		// Inisialisasi user
		User user1 = new User("Amr Fadhilah", "231524002");
		
		// Menampilkan daftar buku di perpustakaan
		perpus.daftarBuku();
		
		// User meminjam buku dengan id: ID1
		user1.pinjamBuku(perpus, "ID1");
		
		// Menampilkan daftar buku yang dipinjam user
		user1.daftarPinjaman();
		
		// Menampilkan daftar buku perpustakaan setelah dipinjam user
		perpus.daftarBuku();
	}

}



