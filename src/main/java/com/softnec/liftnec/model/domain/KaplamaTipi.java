package com.softnec.liftnec.model.domain;

public enum KaplamaTipi {
    Paslanmaz(1),
    Paslanmaz_Degil(2);

    private int kod;

    KaplamaTipi (int kod){
        this.kod = kod;
    }
}
