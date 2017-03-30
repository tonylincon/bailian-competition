/**
 * Create by TPig
 * Since： 2017年3月29日下午8:32:39
 * Filename：InitData.java
 * Description：
 */
package com.bailian.demo.init;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.bailian.demo.dao.UserDao;

/**
 * @author TPig
 * @date 2017年3月29日 下午8:32:39
 * @version 1.0
 */
@Component
public class InitData implements CommandLineRunner {

    /** userDao */
    @Inject
    private UserDao userDao;

    /**
     * 
     * @author TPig
     * @date 2017年3月29日 下午9:07:57
     * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("userDao" + userDao);
    }
}
