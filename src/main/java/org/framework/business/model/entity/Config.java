package org.framework.business.model.entity;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 10/30/13
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Config {

    private String cfgid;
    private String actived;
    private String timestamp;
    private String status;
    private String header;


    public String getCfgid() {
        return cfgid;
    }

    public void setCfgid(String cfgid) {
        this.cfgid = cfgid;
    }

    public String getActived() {
        return actived;
    }

    public void setActived(String actived) {
        this.actived = actived;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}
