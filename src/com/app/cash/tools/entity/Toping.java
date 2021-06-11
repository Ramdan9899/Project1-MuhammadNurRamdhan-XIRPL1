package com.app.cash.tools.entity;

import com.app.cash.tools.dto.Menu;

public class Toping extends Menu {

    public Toping(String nama_toping, double harga){
        setNama_menu(nama_toping);
        setHarga(harga);
        setKategori("Toping");
    }
}
