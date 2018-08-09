package com.softnec.liftnec.model.domain;

public enum HalatTipi {
    Yerli(1),
    Yabanci(2);

    int kod;
    HalatTipi(int kod) {
        this.kod = kod;
    }
}
