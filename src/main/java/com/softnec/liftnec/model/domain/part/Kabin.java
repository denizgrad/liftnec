package com.softnec.liftnec.model.domain.part;

import com.softnec.liftnec.model.cons.KaplamaTipi;
import com.softnec.liftnec.model.cons.MenseiTipi;
import com.softnec.liftnec.model.cons.TamponTipi;
import com.softnec.liftnec.model.domain.BaseModel;

import javax.persistence.Entity;

@Entity
public class Kabin extends BaseModel {

    private KaplamaTipi kaplamaTipi;
    private boolean ovalCam;
    private boolean granit;
    private boolean asiriYuk;
    private boolean ithalFren;
    private MenseiTipi menseiTipi;
    private TamponTipi tamponTipi;

    public Kabin() {
    }

    public KaplamaTipi getKaplamaTipi() {
        return kaplamaTipi;
    }

    public void setKaplamaTipi(KaplamaTipi kaplamaTipi) {
        this.kaplamaTipi = kaplamaTipi;
    }

    public boolean isOvalCam() {
        return ovalCam;
    }

    public void setOvalCam(boolean ovalCam) {
        this.ovalCam = ovalCam;
    }

    public boolean isGranit() {
        return granit;
    }

    public void setGranit(boolean granit) {
        this.granit = granit;
    }

    public boolean isAsiriYuk() {
        return asiriYuk;
    }

    public void setAsiriYuk(boolean asiriYuk) {
        this.asiriYuk = asiriYuk;
    }

    public boolean isIthalFren() {
        return ithalFren;
    }

    public void setIthalFren(boolean ithalFren) {
        this.ithalFren = ithalFren;
    }

    public MenseiTipi getMenseiTipi() {
        return menseiTipi;
    }

    public void setMenseiTipi(MenseiTipi menseiTipi) {
        this.menseiTipi = menseiTipi;
    }

    public TamponTipi getTamponTipi() {
        return tamponTipi;
    }

    public void setTamponTipi(TamponTipi tamponTipi) {
        this.tamponTipi = tamponTipi;
    }
}
