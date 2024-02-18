package com.example.perpustakaan;
import java.util.ArrayList;

public class Perpustakaan {
	// Atribut dari class Perpustakaan
	private ArrayList<Book> buku = new ArrayList<>();
	private int jumlah_buku;
	private String status;
	
	// Constructor
	public Perpustakaan() {
		this.jumlah_buku = 0;
	}

	// Getter dan Setter
	public ArrayList<Book> getBuku() {
		return buku;
	}

	public void setBuku(ArrayList<Book> buku) {
		this.buku = buku;
	}

	public int getJumlah_buku() {
		return jumlah_buku;
	}

	public void setJumlah_buku(int jumlah_buku) {
		this.jumlah_buku = jumlah_buku;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	// Behaviour dari class Perpustakaan
	// Menambahkan Buku baru ke Perpustakaan
	public void tambahBuku(Book bukuBaru) {
		bukuBaru.setIdBuku("ID" + jumlah_buku);
		this.buku.add(bukuBaru);
		this.jumlah_buku++;
	}
	// Menampilkan daftar Buku yang dimiliki Perpustakaan
	public void daftarBuku() {
		for (int i = 0; i < jumlah_buku; i++) {
			System.out.println("ID: " + buku.get(i).getIdBuku());
			System.out.println("Judul: " + buku.get(i).getJudul());
			System.out.println("Penulis: " + buku.get(i).getPenulis());
			System.out.println("Penerbit: " + buku.get(i).getPenerbit());
			System.out.println("Status: " + buku.get(i).getStatus());
			System.out.println();
		}
	}
	// Meminjamkan Buku kepada User
	public Book pinjamkanBuku(String peminjam, String id) {
		int i = 0;
		if (status == "BUKA") {
			while(!(buku.get(i).getIdBuku().equals(id)) && i < jumlah_buku-1) {
				i++;
			}
			if (buku.get(i).getIdBuku().equals(id)) {
				this.buku.get(i).setStatus("Dipinjam oleh " + peminjam);
				return buku.get(i);
			} else {
				System.out.println("Buku tidak ditemukan.");
				return null;
			}
		} else {
			System.out.println("Mohon maaf, hari ini kami sedang tutup.");
			return null;
		}
	}
}
