package com.cbadpig.tell.me.demo.controller;

import com.cbadpig.tell.me.demo.bean.DisciplineStudent;
import com.cbadpig.tell.me.demo.bean.ExceptionPaper;
import com.cbadpig.tell.me.demo.bean.TestSubjectTotal;
import com.cbadpig.tell.me.demo.bean.WordBean;
import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.policy.HackLoopTableRenderPolicy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordToTable {

    public static void word(String templatePath,String wordPath) {
        try {
            WordBean wordBean = new WordBean();
            initData(wordBean);

            HackLoopTableRenderPolicy hackLoopTableRenderPolicy = new HackLoopTableRenderPolicy();
            Configure config = Configure.newBuilder().bind("testSubjectTotalList", hackLoopTableRenderPolicy)
                    .bind("exceptionPaperList", hackLoopTableRenderPolicy)
                    .bind("disciplineStudentList", hackLoopTableRenderPolicy).build();
            XWPFTemplate.compile(templatePath,config).render(wordBean).writeToFile(wordPath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initData(WordBean wordBean) {

        wordBean.setTitle("2019年度全国会计专业技术资格无纸化考试上报数据统计汇总情况表（中级）");
        wordBean.setMc("贵州");
        wordBean.setYcsjCount(10);
        wordBean.setWjCount(3);

        List<TestSubjectTotal> testSubjectTotalList = new ArrayList<>();
        testSubjectTotalList.add(new TestSubjectTotal("财务管理",24243,10267,10266,1,""));
        testSubjectTotalList.add(new TestSubjectTotal("经济法",25607,10267,10266,1,""));
        testSubjectTotalList.add(new TestSubjectTotal("中级会计实务",25475,10267,10266,1,""));

        List<ExceptionPaper> exceptionPaperList = new ArrayList<>();
        exceptionPaperList.add(new ExceptionPaper(1,"财务管理","13401000718","441381198211306610","卢智贤","监考老师核查，判断情况属实",""));
        exceptionPaperList.add(new ExceptionPaper(2,"经济法","13401000718","441381198211306610","卢智贤","监考老师核查，判断情况属实",""));
        exceptionPaperList.add(new ExceptionPaper(3,"经济法","13401000718","441381198211306610","卢智贤","监考老师核查，判断情况属实",""));
        exceptionPaperList.add(new ExceptionPaper(4,"中级会计实务","13401000718","441381198211306610","卢智贤","监考老师核查，判断情况属实",""));

        List<DisciplineStudent> disciplineStudentList = new ArrayList<>();
        disciplineStudentList.add(new DisciplineStudent(1,"财务管理","13401000718","441381198211306610","卢智贤","205-使用禁止带入考场的通讯工具、规定以外的电子用品的","当次全部科目考试成绩无效，违纪违规行为记入专业技术人员资格考试诚信档案库，记录期限为五年。",""));
        disciplineStudentList.add(new DisciplineStudent(2,"中级会计实务","13401000718","441381198211306610","卢智贤","205-使用禁止带入考场的通讯工具、规定以外的电子用品的","当次全部科目考试成绩无效，违纪违规行为记入专业技术人员资格考试诚信档案库，记录期限为五年。",""));


        wordBean.setTestSubjectTotalList(testSubjectTotalList);
        wordBean.setExceptionPaperList(exceptionPaperList);
        wordBean.setDisciplineStudentList(disciplineStudentList);
    }
/*
    public static void main(String[] args) {
        String templatePath = "C:\\Users\\cbadpig\\Desktop\\word\\template2.docx";
        String wordPath = "C:\\Users\\cbadpig\\Desktop\\word\\template_out2.docx";
        word(templatePath,wordPath);

    }*/
}
