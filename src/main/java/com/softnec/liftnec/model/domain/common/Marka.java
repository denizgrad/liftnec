package com.softnec.liftnec.model.domain.common;

import com.softnec.liftnec.model.domain.BaseModel;

import javax.persistence.Entity;

@Entity
public class Marka extends BaseModel {
    private String adi;
    private Class tipi;

    public Marka() {
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Class getTipi() {
        return tipi;
    }

    public void setTipi(Class tipi) {
        this.tipi = tipi;
    }
}
