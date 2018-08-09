package com.softnec.liftnec.model.domain;

public enum KapiPanelTipi {
    Teleskopik(1),
    Merkezi(2),
    Teleskopik_veya_Merkezi(3);

    private int kod ;

    KapiPanelTipi(int i) {
        this.kod = i;
    }
}
