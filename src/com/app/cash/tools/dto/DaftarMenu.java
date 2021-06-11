package com.app.cash.tools.dto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DaftarMenu {

    private ArrayList<Menu> daftarMenu;

    public DaftarMenu() {
        daftarMenu = new ArrayList<>();
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public void getMenuByKategori(String kategori) {
        System.out.println("======== " + kategori + " ========");

        for (int i = 0; i < daftarMenu.size(); i++){
            Menu m = daftarMenu.get(i);
            if (m.getKategori().equals(kategori)){
                System.out.println((i + 1) + ". " + m.getNama_menu() + "\t" + m.getHarga());
            }
        }
    }

    public void tampilDaftarMenu() {
        System.out.println("======== SUKAMAKAN ========" );
        getMenuByKategori("Ramen");
        getMenuByKategori("Kuah");
        getMenuByKategori("Toping");
        getMenuByKategori("Minuman");
    }

    public Menu pilihMenu() {
        try{
            Scanner input = new Scanner(System.in);

            System.out.println("Nomor menu yang dipesan : ");
            int no_menu = input.nextInt();

            Menu m = daftarMenu.get(no_menu-1);

            if (!m.getKategori().equalsIgnoreCase("Kuah")){
                return m;
            }else{
                System.out.println("[Err] Pesan dulu Menu Ramen");
                return pilihMenu();
            }
        }catch(IndexOutOfBoundsException err) {
            System.out.println("[Err] Pesanan Tidak Tersedia");
            return pilihMenu();
        }catch(InputMismatchException err) {
            System.out.println("[Err] Mohon masukan nomor menu");
            return pilihMenu();
        }
    }
    public Menu pilihKuah(){
        try{
            Scanner input = new Scanner(System.in);

            System.out.println("Kuah [sesuai nomor menu] :");
            int no_menu = input.nextInt();

            Menu m = daftarMenu.get(no_menu-1);

            if(m.getKategori().equalsIgnoreCase("Kuah")){
                return m;
            }else{
                System.out.println("[Err] Bukan Menu Kuah");
                return pilihKuah();
            }
        }catch(IndexOutOfBoundsException err) {
            System.out.println("[Err] Pesanan Tidak tersedia");
            return pilihKuah();
        }catch(InputMismatchException err){
            System.out.println("[Err] Mohon Masukan nomor kuah");
            return pilihKuah();
        }
    }

}
