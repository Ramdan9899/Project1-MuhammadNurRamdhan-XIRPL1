package com.app.cash.tools.dto;

public class Menu {

    private String nama_menu;
    private double harga;
    private String kategori;

    public String getNama_menu() {
        return nama_menu;
    }

    public void setNama_menu(String ama_menu) {
        this.nama_menu = ama_menu;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
