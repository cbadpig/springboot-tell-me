package com.cbadpig.tell.me.demo.bean;

/**
 * 考试科目统计
 */
public class TestSubjectTotal {

    private String kmmc;        //科目名称
    private int bmrs;           //报名人数
    private int kmCount;        //合计
    private int sjCount;        //有效试卷
    private int ycsj;           //异常试卷
    private String bz;          //备注

    public TestSubjectTotal() {}

    public TestSubjectTotal(String kmmc,int bmrs,int kmCount,int sjCount,int ycsj,String bz) {
        this.kmmc = kmmc;
        this.bmrs = bmrs;
        this.kmCount = kmCount;
        this.sjCount = sjCount;
        this.ycsj = ycsj;
        this.bz = bz;
    }

    public String getKmmc() {
        return kmmc;
    }

    public void setKmmc(String kmmc) {
        this.kmmc = kmmc;
    }

    public int getBmrs() {
        return bmrs;
    }

    public void setBmrs(int bmrs) {
        this.bmrs = bmrs;
    }

    public int getKmCount() {
        return kmCount;
    }

    public void setKmCount(int kmCount) {
        this.kmCount = kmCount;
    }

    public int getSjCount() {
        return sjCount;
    }

    public void setSjCount(int sjCount) {
        this.sjCount = sjCount;
    }

    public int getYcsj() {
        return ycsj;
    }

    public void setYcsj(int ycsj) {
        this.ycsj = ycsj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
