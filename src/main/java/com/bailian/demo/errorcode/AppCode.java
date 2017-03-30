/**
 * Create by TPig
 * Since： 2017年1月6日上午10:26:45
 * Filename：ReturnCode.java
 * Description：
 */
package com.bailian.demo.errorcode;

/**
 * @author TPig
 * @version 1.0
 */
public enum AppCode {

    SUCCESS("1000000", "成功"), ERROR("1000001", "失败"),

    ;

    /** errCode */
    private String errCode;
    /** errMsg */
    private String errMsg;

    /**
     * 构造函数
     * 
     * @param errCode
     * @param errMsg
     */
    private AppCode(String errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    /**
     * 返回 errCode
     * 
     * @return errCode
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * 返回 errMsg
     * 
     * @return errMsg
     */
    public String getErrMsg() {
        return errMsg;
    }

}
