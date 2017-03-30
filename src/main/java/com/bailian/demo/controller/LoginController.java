/**
 * Create by TPig
 * Since： 2017年3月29日下午7:44:41
 * Filename：LoginController.java
 * Description：
 */
package com.bailian.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bailian.demo.bean.ReturnBo;
import com.bailian.demo.entity.UserInfo;

/**
 * @author TPig
 * @date 2017年3月29日 下午7:44:41
 * @version 1.0
 */
@RestController
public class LoginController {

    /** logger */
    private Logger logger = LoggerFactory.getLogger(getClass());

    /*
     * TODO 注入UserService
     * 适用场景：用户登录验证
     */

    /**
     * 登录请求
     * 
     * @author TPig
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ReturnBo login(UserInfo user) {
        ReturnBo bo = new ReturnBo();
        logger.info("用户名：" + user.getName() + " | 密码：" + user.getPassword());
        return bo;
    }
}
