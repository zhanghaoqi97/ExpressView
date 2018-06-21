package com.hsh;

/**
 * 项目名称: HopsonLife
 * 创建人：Zhq
 * 修改人：gy
 * 修改时间：2018/6/21 23:12
 * 类描述：
 * 修改备注:
 */

public class Trace {
    /**
     * 时间
     */
    private String acceptTime;
    /**
     * 描述
     */
    private String acceptStation;

    public Trace() {
    }

    public Trace(String acceptTime, String acceptStation) {
        this.acceptTime = acceptTime;
        this.acceptStation = acceptStation;
    }

    public String getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    public String getAcceptStation() {
        return acceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        this.acceptStation = acceptStation;
    }
}
