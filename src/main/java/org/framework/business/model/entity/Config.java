package org.framework.business.model.entity;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 10/30/13
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name="config")
public class Config implements Serializable {

    private static final long serialVersionUID = -3838732995856086554L;

    @Id
    @GeneratedValue
    private Long cid;

    @Column(length=20,nullable=false)
    //@Pattern(regexp = "[A-Za-z0-9]{5,20}", message = "以字母开头,5-20位")
    private String name;

    private String actived;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActived() {
        return actived;
    }

    public void setActived(String actived) {
        this.actived = actived;
    }

    public Config(String name) {
        this.name = name;
    }

    public Config() {
    }
}
