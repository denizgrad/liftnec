package com.softnec.liftnec.model.domain.part;

import com.softnec.liftnec.model.domain.BaseModel;
import com.softnec.liftnec.model.domain.common.Marka;

import javax.persistence.Entity;

@Entity
public class Ray extends BaseModel {
    private Marka marka;
    private int en_mm;
    private int boy_mm;
    private int derinlik_mm;

    public Ray() {
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

    public int getDerinlik_mm() {
        return derinlik_mm;
    }

    public void setDerinlik_mm(int derinlik_mm) {
        this.derinlik_mm = derinlik_mm;
    }
}
