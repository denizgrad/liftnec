package com.softnec.liftnec.model.domain;

public enum MenseiTipi {

    Yerli(1),
    Yabanci(2);

    private int kod;

    MenseiTipi(int i) {
        this.kod=i;
    }
}
