package com.cbadpig.tell.me.demo.bean;

/**
 * 违纪考生列表
 */
public class DisciplineStudent {

    private int xh;         //序号
    private String kmmc;    //  科目名称
    private String zkzh;    //准考账号
    private String zjbm;    //证件编码
    private String xm;      //姓名
    private String wjlx;    //违纪类型
    private String cljg;    //处理结果
    private String bz;      //备注

    public DisciplineStudent() {}

    public DisciplineStudent(int xh,String kmmc,String zkzh,String zjbm,String xm, String wjlx,String cljg,String bz) {
        this.xh = xh;
        this.kmmc = kmmc;
        this.zkzh = zkzh;
        this.zjbm = zjbm;
        this.xm = xm;
        this.wjlx = wjlx;
        this.cljg = cljg;
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

    public String getWjlx() {
        return wjlx;
    }

    public void setWjlx(String wjlx) {
        this.wjlx = wjlx;
    }

    public String getCljg() {
        return cljg;
    }

    public void setCljg(String cljg) {
        this.cljg = cljg;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
