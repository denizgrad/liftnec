package com.softnec.liftnec.model.domain.part;

import com.softnec.liftnec.model.cons.KapiPanelTipi;
import com.softnec.liftnec.model.cons.KaplamaTipi;
import com.softnec.liftnec.model.domain.BaseModel;
import com.softnec.liftnec.model.domain.common.Marka;

import javax.persistence.Entity;

@Entity
public class Kapi extends BaseModel {
    private Marka marka;
    private int en_mm;
    private int boy_mm;
    private boolean ciftGiris;
    private KaplamaTipi kaplamaTipi;
    private int kapiPanelSayisi;
    private KapiPanelTipi kapiPanelTipi;

    public Kapi() {
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public int getEn_mm() {
        return en_mm;
    }

    public void setEn_mm(int en_mm) {
        this.en_mm = en_mm;
    }

    public int getBoy_mm() {
        return boy_mm;
    }

    public void setBoy_mm(int boy_mm) {
        this.boy_mm = boy_mm;
    }

    public boolean isCiftGiris() {
        return ciftGiris;
    }

    public void setCiftGiris(boolean ciftGiris) {
        this.ciftGiris = ciftGiris;
    }

    public KaplamaTipi getKaplamaTipi() {
        return kaplamaTipi;
    }

    public void setKaplamaTipi(KaplamaTipi kaplamaTipi) {
        this.kaplamaTipi = kaplamaTipi;
    }

    public int getKapiPanelSayisi() {
        return kapiPanelSayisi;
    }

    public void setKapiPanelSayisi(int kapiPanelSayisi) {
        this.kapiPanelSayisi = kapiPanelSayisi;
    }

    public KapiPanelTipi getKapiPanelTipi() {
        return kapiPanelTipi;
    }

    public void setKapiPanelTipi(KapiPanelTipi kapiPanelTipi) {
        this.kapiPanelTipi = kapiPanelTipi;
    }
}
