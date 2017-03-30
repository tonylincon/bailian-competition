/**
 * Create by TPig
 * Since： 2017年1月5日下午4:14:48
 * Filename：ReturnCode.java
 * Description：
 */
package com.bailian.demo.bean;

import java.io.Serializable;

import com.bailian.demo.errorcode.AppCode;

/**
 * 返回编码
 * 
 * @author TPig
 * @version 1.0
 */
public class ReturnBo implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 2454950041375101365L;

    /** 返回编码 */
    private String            resCode;

    /** 返回信息 */
    private String            msg;

    /** 数据实体 */
    private Object            obj;

    /**
     * 构造函数
     */
    public ReturnBo() {
        this.resCode = AppCode.SUCCESS.getErrCode();
        this.msg = AppCode.SUCCESS.getErrMsg();
    }

    // ========================================get=set==============================================

    /**
     * 返回 resCode
     * 
     * @return resCode
     */
    public String getResCode() {
        return resCode;
    }

    /**
     * 返回 obj
     * 
     * @return obj
     */
    public Object getObj() {
        return obj;
    }

    /**
     * 设置 obj
     * 
     * @param obj
     */
    public void setObj(Object obj) {
        this.obj = obj;
    }

    /**
     * 
     * @author TPig
     * @param appCode
     */
    public void setAppCode(AppCode appCode) {
        this.resCode = appCode.getErrCode();
        this.msg = appCode.getErrMsg();
    }

    /**
     * 设置 resCode
     * 
     * @param resCode
     */
    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    /**
     * 返回 msg
     * 
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置 msg
     * 
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
