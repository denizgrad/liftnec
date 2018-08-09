package com.softnec.liftnec.model.domain;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Asansor extends AModel{

    private double hizlanma;
    private int kapasiteKg;
    private TahrikTipi tahrikTipi;
    private int durakSayisi;
    private int katSayisi;
    private int kuyuGenisligi_mm;
    private int kuyuDerinligi_mm;
    private List<Motor> motor;
    private List<Kapi> kapi;
    private List<Kabin> kabin;
    private List<Ray> ray;
    private List<KumandaPanosu> kumandaPanosu;
}
