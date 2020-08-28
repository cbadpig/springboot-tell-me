package com.cbadpig.tell.me.demo.bean;

import java.util.List;

public class WordBean {

    private String title;   //文档标题
    private String mc;      //省市县区名称
    private int ycsjCount;  //异常卷总个数
    private int wjCount;    //违纪总人数
    private List<TestSubjectTotal> testSubjectTotalList;    //考试科目列表
    private List<ExceptionPaper> exceptionPaperList;    //异常试卷列表
    private List<DisciplineStudent> disciplineStudentList;    //违纪考生列表

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public int getYcsjCount() {
        return ycsjCount;
    }

    public void setYcsjCount(int ycsjCount) {
        this.ycsjCount = ycsjCount;
    }

    public int getWjCount() {
        return wjCount;
    }

    public void setWjCount(int wjCount) {
        this.wjCount = wjCount;
    }

    public List<TestSubjectTotal> getTestSubjectTotalList() {
        return testSubjectTotalList;
    }

    public void setTestSubjectTotalList(List<TestSubjectTotal> testSubjectTotalList) {
        this.testSubjectTotalList = testSubjectTotalList;
    }

    public List<ExceptionPaper> getExceptionPaperList() {
        return exceptionPaperList;
    }

    public void setExceptionPaperList(List<ExceptionPaper> exceptionPaperList) {
        this.exceptionPaperList = exceptionPaperList;
    }

    public List<DisciplineStudent> getDisciplineStudentList() {
        return disciplineStudentList;
    }

    public void setDisciplineStudentList(List<DisciplineStudent> disciplineStudentList) {
        this.disciplineStudentList = disciplineStudentList;
    }
}


