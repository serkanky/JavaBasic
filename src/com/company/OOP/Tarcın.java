package com.company.OOP;

public class Tarcın extends Dog implements UcamayanCanlı{
    @Override
    public void sesTonu() {

    }

    @Override
    public void yuru() {
        sagOnAyakHareketEttir();
        sagArkaAyakHareketEttir();
        solOnAyakHareketEttir();
        solArkaAyakHareketEttir();
    }
}
