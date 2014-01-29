package org.framework.business.app.vo;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;


/**
 * 
 * @author songjian @Mar 1, 2013
 */
public class Member implements Serializable {

	private static final long serialVersionUID = 8230208486954319424L;
	
	public Member(){
		super();
	}
	
	@Length(min=1, max=20, message="长度不合法")
	private String name;
	
	@NotBlank(message = "{user.deletegroup.notempty}")
	private String description;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	
	
}
