package com.softnec.liftnec.model.cons;

public enum HalatTipi {
    Yerli(1),
    Yabanci(2);

    int kod;
    HalatTipi(int kod) {
        this.kod = kod;
    }
}
