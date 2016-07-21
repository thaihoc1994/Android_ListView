package listview.learn.thaihoc.model;

import java.io.Serializable;

/**
 * Created by thaihoc on 7/20/2016.
 */
public class TiGia implements Serializable {
    private int ma;
    private String nuoc;
    private int imgSource;
    private Long giaMuaTM;
    private Long giaBanTM;
    private Long giaMuaCK;
    private Long giaBanCK;

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getNuoc() {
        return nuoc;
    }

    public int getImgSource() {
        return imgSource;
    }

    public void setImgSource(int imgSource) {
        this.imgSource = imgSource;
    }

    public void setNuoc(String nuoc) {
        this.nuoc = nuoc;
    }

    public Long getGiaMuaTM() {
        return giaMuaTM;
    }

    public void setGiaMuaTM(Long giaMuaTM) {
        this.giaMuaTM = giaMuaTM;
    }

    public Long getGiaBanTM() {
        return giaBanTM;
    }

    public void setGiaBanTM(Long giaBanTM) {
        this.giaBanTM = giaBanTM;
    }

    public Long getGiaMuaCK() {
        return giaMuaCK;
    }

    public void setGiaMuaCK(Long giaMuaCK) {
        this.giaMuaCK = giaMuaCK;
    }

    public Long getGiaBanCK() {
        return giaBanCK;
    }

    public void setGiaBanCK(Long giaBanCK) {
        this.giaBanCK = giaBanCK;
    }

    public TiGia() {
    }

    public TiGia(int ma, String nuoc, int imgSource, Long giaMuaTM, Long giaBanTM, Long giaMuaCK, Long giaBanCK) {
        this.ma = ma;
        this.nuoc = nuoc;
        this.imgSource = imgSource;
        this.giaMuaTM = giaMuaTM;
        this.giaBanTM = giaBanTM;
        this.giaMuaCK = giaMuaCK;
        this.giaBanCK = giaBanCK;
    }
}
