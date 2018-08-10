package com.softnec.liftnec.model.domain.part;

import com.softnec.liftnec.model.domain.BaseModel;
import com.softnec.liftnec.model.domain.common.Marka;

import javax.persistence.Entity;

@Entity
public class KumandaPanosu extends BaseModel {

    private Marka marka;
    private boolean yatayButon;
    private boolean rifitKart;
    private boolean lcdKatButon;
    private boolean lcdKapiButon;
    private boolean tftKabinButonu;
    private boolean lcdKabinButonu;
    private boolean kapiUstuSevenSegmentGosterge;

    public KumandaPanosu() {
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public boolean isYatayButon() {
        return yatayButon;
    }

    public void setYatayButon(boolean yatayButon) {
        this.yatayButon = yatayButon;
    }

    public boolean isRifitKart() {
        return rifitKart;
    }

    public void setRifitKart(boolean rifitKart) {
        this.rifitKart = rifitKart;
    }

    public boolean isLcdKatButon() {
        return lcdKatButon;
    }

    public void setLcdKatButon(boolean lcdKatButon) {
        this.lcdKatButon = lcdKatButon;
    }

    public boolean isLcdKapiButon() {
        return lcdKapiButon;
    }

    public void setLcdKapiButon(boolean lcdKapiButon) {
        this.lcdKapiButon = lcdKapiButon;
    }

    public boolean isTftKabinButonu() {
        return tftKabinButonu;
    }

    public void setTftKabinButonu(boolean tftKabinButonu) {
        this.tftKabinButonu = tftKabinButonu;
    }

    public boolean isLcdKabinButonu() {
        return lcdKabinButonu;
    }

    public void setLcdKabinButonu(boolean lcdKabinButonu) {
        this.lcdKabinButonu = lcdKabinButonu;
    }

    public boolean isKapiUstuSevenSegmentGosterge() {
        return kapiUstuSevenSegmentGosterge;
    }

    public void setKapiUstuSevenSegmentGosterge(boolean kapiUstuSevenSegmentGosterge) {
        this.kapiUstuSevenSegmentGosterge = kapiUstuSevenSegmentGosterge;
    }
}
