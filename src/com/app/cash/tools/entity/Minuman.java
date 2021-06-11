package com.app.cash.tools.entity;

import com.app.cash.tools.dto.Menu;

public class Minuman extends Menu {

    public Minuman(String nama_minuman, double harga){
        setNama_menu(nama_minuman);
        setHarga(harga);
        setKategori("Minuman");
    }
}
