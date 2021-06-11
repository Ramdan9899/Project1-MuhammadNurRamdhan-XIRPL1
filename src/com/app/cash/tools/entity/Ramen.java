package com.app.cash.tools.entity;

import com.app.cash.tools.dto.Menu;

public class Ramen extends Menu {

    public Ramen(String nama_ramen, double harga) {
        setNama_menu(nama_ramen);
        setHarga(harga);
        setKategori("Ramen");
    }
}
