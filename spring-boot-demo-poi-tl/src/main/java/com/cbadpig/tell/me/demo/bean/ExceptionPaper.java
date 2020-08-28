package com.cbadpig.tell.me.demo.bean;

/**
 * 异常试卷列表
 */
public class ExceptionPaper {

    private int xh;         //序号
    private String kmmc;    //  科目名称
    private String zkzh;    //准考账号
    private String zjbm;    //证件编码
    private String xm;      //姓名
    private String ycms;    //异常原因
    private String bz;      //备注

    public ExceptionPaper() {}

    public ExceptionPaper(int xh,String kmmc,String zkzh,String zjbm,String xm, String ycms,String bz) {
        this.xh = xh;
        this.kmmc = kmmc;
        this.zkzh = zkzh;
        this.zjbm = zjbm;
        this.xm = xm;
        this.ycms = ycms;
        this.bz = bz;
    }

    public int getXh() {
        return xh;
    }

    public void setXh(int xh) {
        this.xh = xh;
    }

    public String getKmmc() {
        return kmmc;
    }

    public void setKmmc(String kmmc) {
        this.kmmc = kmmc;
    }

    public String getZkzh() {
        return zkzh;
    }

    public void setZkzh(String zkzh) {
        this.zkzh = zkzh;
    }

    public String getZjbm() {
        return zjbm;
    }

    public void setZjbm(String zjbm) {
        this.zjbm = zjbm;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getYcms() {
        return ycms;
    }

    public void setYcms(String ycms) {
        this.ycms = ycms;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
