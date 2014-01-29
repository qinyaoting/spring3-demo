package com.abin.lee.spring.redis.pojo;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/24/14
 * Time: 10:04 PM
 * To change this template use File | Settings | File Templates.
 */

import java.io.Serializable;
public class User implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 2668307865623183776L;
    private String uid;
    private String address;
    public User() {
        super();
    }
    public User(String uid, String address) {
        super();
        this.uid = uid;
        this.address = address;
    }

    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "User [uid=" + uid + ", address=" + address + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((uid == null) ? 0 : uid.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (uid == null) {
            if (other.uid != null)
                return false;
        } else if (!uid.equals(other.uid))
            return false;
        return true;
    }


}
