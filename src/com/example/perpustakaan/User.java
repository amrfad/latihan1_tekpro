package com.example.perpustakaan;
import java.util.ArrayList;

public class User {
	// Atribut dari class User
	private String nama;
	private String nim;
	private ArrayList<Book> buku_dipinjam = new ArrayList<>();
	private int jumlah_pinjaman;
	
	// Constructor
	public User(String nama, String nim) {
		this.nama = nama;
		this.nim = nim;
		this.jumlah_pinjaman = 0;
	}

	// Getter dan Setter
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}
	public int getJumlah_pinjaman() {
		return jumlah_pinjaman;
	}
	public void setJumlah_pinjaman(int jumlah_pinjaman) {
		this.jumlah_pinjaman = jumlah_pinjaman;
	}
	
	// Behaviour dari class User
	// Meminjam buku ke Perpustakaan
	public void pinjamBuku(Perpustakaan perpus, String id) {
		Book buku = perpus.pinjamkanBuku(nama, id);
		if(buku != null) {
			this.buku_dipinjam.add(buku);
			this.jumlah_pinjaman++;
		}
	}
	// Menampilkan daftar buku yang dipinjam User
	public void daftarPinjaman() {
		for (int i = 0; i < jumlah_pinjaman; i++) {
			System.out.println("ID: " + buku_dipinjam.get(i).getIdBuku());
			System.out.println("Judul: " + buku_dipinjam.get(i).getJudul());
			System.out.println("Penulis: " + buku_dipinjam.get(i).getPenulis());
			System.out.println("Penerbit: " + buku_dipinjam.get(i).getPenerbit());
			System.out.println("Status: " + buku_dipinjam.get(i).getStatus());
			System.out.println();
		}
	}
}
