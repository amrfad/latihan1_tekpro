package com.example.perpustakaan;

public class Book {
	// Atribut dari class Book
	private String idBuku;
	private String judul;
	private String penulis;
	private String penerbit;
	private String status;
	
	// Constructor
	public Book(String judul, String penulis, String penerbit, String status) {
		this.judul = judul;
		this.penulis = penulis;
		this.penerbit = penerbit;
		this.status = status;
	}
	
	// Getter dan Setter
	public String getIdBuku() {
		return idBuku;
	}
	public void setIdBuku(String idBuku) {
		this.idBuku = idBuku;
	}
	public String getJudul() {
		return judul;
	}
	public void setJudul(String judul) {
		this.judul = judul;
	}
	public String getPenulis() {
		return penulis;
	}
	public void setPenulis(String penulis) {
		this.penulis = penulis;
	}
	public String getPenerbit() {
		return penerbit;
	}
	public void setPenerbit(String penerbit) {
		this.penerbit = penerbit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
