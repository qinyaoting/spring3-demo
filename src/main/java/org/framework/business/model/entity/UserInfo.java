package org.framework.business.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;


/**
 * 用户信息
 * @author cml
 *
 */
@Entity
@Table(name="T_UserInfo")
public class UserInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3838732995856086555L;
	
	@Id
    @GeneratedValue
    private Long id;

	//账号
    @Column(length=20,nullable=false)
    @Pattern(regexp = "[A-Za-z0-9]{5,20}", message = "以字母开头,5-20位")
    private String account;
    //密码
    @Column(length=10,nullable=false)
    private String password;
    //姓名
    @Column(length=32,nullable=false)
    private String name;
    
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
