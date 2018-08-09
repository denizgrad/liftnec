package com.softnec.liftnec.model.domain;

public enum TamponTipi {
    Kaucuk(1),
    Metal(2);

    int kod;
    TamponTipi(int kod) {
        this.kod = kod;
    }
}
