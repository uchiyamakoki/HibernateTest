package com.akaxia.po;

import java.util.Set;

/**
 * Sjzdfl entity. @author MyEclipse Persistence Tools
 */
public class Sjzdfl extends AbstractSjzdfl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Sjzdfl() {
	}

	/** minimal constructor */
	public Sjzdfl(Integer sjzdflid) {
		super(sjzdflid);
	}

	/** full constructor */
	public Sjzdfl(Integer sjzdflid, String sjzdflmc, Set sjzdxxes) {
		super(sjzdflid, sjzdflmc, sjzdxxes);
	}

}
