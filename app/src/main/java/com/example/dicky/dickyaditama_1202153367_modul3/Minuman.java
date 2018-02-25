package com.example.dicky.dickyaditama_1202153367_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Minuman {

    String namaMinuman, detailMinuman, komposisiMinuman;
    int foto;

    public String getNamaMinuman() {
        return namaMinuman;
    }

    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }

    public String getDetailMinuman() {
        return detailMinuman;
    }

    public void setDetailMinuman(String detailMinuman) {
        this.detailMinuman = detailMinuman;
    }

    public String getKomposisiMinuman() {
        return komposisiMinuman;
    }

    public void setKomposisiMinuman(String komposisiMinuman) {
        this.komposisiMinuman = komposisiMinuman;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public Minuman(int foto, String namaMinuman, String detailMinuman, String komposisiMinuman){
        this.namaMinuman = namaMinuman;
        this.detailMinuman = detailMinuman;
        this.komposisiMinuman = komposisiMinuman;
        this.foto = foto;
    }
}
