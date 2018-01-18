package com.akaxia.po;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSjzdfl entity provides the base persistence definition of the Sjzdfl
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSjzdfl implements java.io.Serializable {

	// Fields

	private Integer sjzdflid;
	private String sjzdflmc;
	private Set sjzdxxes = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSjzdfl() {
	}

	/** minimal constructor */
	public AbstractSjzdfl(Integer sjzdflid) {
		this.sjzdflid = sjzdflid;
	}

	/** full constructor */
	public AbstractSjzdfl(Integer sjzdflid, String sjzdflmc, Set sjzdxxes) {
		this.sjzdflid = sjzdflid;
		this.sjzdflmc = sjzdflmc;
		this.sjzdxxes = sjzdxxes;
	}

	// Property accessors

	public Integer getSjzdflid() {
		return this.sjzdflid;
	}

	public void setSjzdflid(Integer sjzdflid) {
		this.sjzdflid = sjzdflid;
	}

	public String getSjzdflmc() {
		return this.sjzdflmc;
	}

	public void setSjzdflmc(String sjzdflmc) {
		this.sjzdflmc = sjzdflmc;
	}

	public Set getSjzdxxes() {
		return this.sjzdxxes;
	}

	public void setSjzdxxes(Set sjzdxxes) {
		this.sjzdxxes = sjzdxxes;
	}

}