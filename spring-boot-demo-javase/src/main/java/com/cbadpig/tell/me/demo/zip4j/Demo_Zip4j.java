package com.cbadpig.tell.me.demo.zip4j;

import lombok.SneakyThrows;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.FileHeader;
import org.apache.commons.io.IOUtils;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.InputStream;

public class Demo_Zip4j {
    @SneakyThrows
    public static void main(String[] args) {

        String zipFile_Extracting_rar = "X:\\data\\logs.rar";
        String zipFile_Extracting_zip = "X:\\data\\logs2.zip";
        String zipFile_Extracting_360zip = "X:\\data\\物理360.zip";
        String zipFile_Extracting_360z = "X:\\data\\物理360.7z";
        String zipFolder_Extracting = "X:\\data";

        /**
         * 1.解压压缩文件
         */

        //1.1普通解压
        ZipFile zipFile = new ZipFile(zipFile_Extracting_360zip);
        FileHeader fileHeader = zipFile.getFileHeader("6.html");
        InputStream inputStream = zipFile.getInputStream(fileHeader);
//        ZipFile zipFile = new ZipFile(zipFile_Extracting_360zip);
//        ZipArchiveEntry zipArchiveEntry = zipFile.getEntry("6.html");
//        InputStream in = zipFile.getInputStream(zipArchiveEntry);

        String classpath = ResourceUtils.getURL("classpath:").getPath();

        new File(classpath).getParentFile().getPath();

        System.out.println(new File(classpath).getParentFile().getPath());


        //System.out.println(IOUtils.toString(inputStream,"UTF-8"));

    }
}
