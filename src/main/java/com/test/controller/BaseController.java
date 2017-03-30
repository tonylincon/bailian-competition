package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author zhuweizhu
 *
 */
@RestController
public class BaseController {
	    
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String createUser() {
        return "asdf";
    }
	
}
