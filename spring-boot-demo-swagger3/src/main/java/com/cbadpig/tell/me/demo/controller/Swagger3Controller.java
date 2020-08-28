package com.cbadpig.tell.me.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "swagger3Test测试类说明")
@RestController
public class Swagger3Controller {

    @ApiOperation(value = "get测试方法说明",notes = "get测试方法备注说明")
    @ApiImplicitParam(name = "name", value = "姓名", required = true,dataType = "java.lang.String")
    @GetMapping("/swagger3")
    public String swagger3Test(String name) {
        return "测试成功," + name;
    }

    @ApiOperation(value = "post测试方法说明",notes = "post测试方法备注说明")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "姓名", required = true,dataType = "java.lang.String"),
            @ApiImplicitParam(name = "age", value = "年龄", required = true,dataType = "java.lang.String")
    })
    @PostMapping("/swagger3Post")
    public String swagger3TestPost(String name,String age) {
        return "测试成功," + name + "," + age;
    }
}
