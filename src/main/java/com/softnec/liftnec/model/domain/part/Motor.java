package com.softnec.liftnec.model.domain.part;

import com.softnec.liftnec.model.cons.HalatTipi;
import com.softnec.liftnec.model.domain.BaseModel;
import com.softnec.liftnec.model.domain.common.Marka;

import javax.persistence.Entity;

@Entity
public class Motor extends BaseModel {

    private Marka marka;
    private String model;
    private HalatTipi halatTipi;

    public Motor() {
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public HalatTipi getHalatTipi() {
        return halatTipi;
    }

    public void setHalatTipi(HalatTipi halatTipi) {
        this.halatTipi = halatTipi;
    }
}
