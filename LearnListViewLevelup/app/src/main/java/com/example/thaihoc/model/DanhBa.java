package com.example.thaihoc.model;

import java.io.Serializable;

/**
 * Created by thaihoc on 7/20/2016.
 */
public class DanhBa implements Serializable{
    private int ma;
    private String ten;
    private String sdt;

    public DanhBa() {
    }

    public DanhBa(int ma, String ten, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
