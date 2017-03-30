package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.dao.H2DemoInfoRepository;
import com.test.entity.H2DemoInfo;

@RestController
public class H2DemoInfoController {

    @Autowired
    private H2DemoInfoRepository demoInfoRepository;

   

    /**
     * 保存数据.
     * @return
     */
    @RequestMapping("/save")
    public String save(){

        // 内存数据库操作 

       demoInfoRepository.save(new H2DemoInfo("title1", "content1")); 

       demoInfoRepository.save(new H2DemoInfo("title2", "content2")); 

       demoInfoRepository.save(new H2DemoInfo("title3", "content3")); 

       demoInfoRepository.save(new H2DemoInfo("title4", "content4")); 

       demoInfoRepository.save(new H2DemoInfo("title5", "content5")); 

       return "save ok";

    }

    /**
     * 获取所有数据.
     * @return
     */
    @RequestMapping("/findAll")
    public Iterable<H2DemoInfo> findAll(){

        // 内存数据库操作 
       return demoInfoRepository.findAll();

    }

}