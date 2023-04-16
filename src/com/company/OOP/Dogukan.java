package com.company.OOP;

public class Dogukan extends Insan implements UcamayanCanlı{
    @Override
    public void sesTonu() {
        System.out.println("Sesss");
    }

    @Override
    public void yuru() {
        sagAyakHareketEttir();
        solAyakHareketEttir();
    }
}
