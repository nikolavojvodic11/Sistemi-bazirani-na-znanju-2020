package com.sbnz.berza.model;
// Generated Jun 25, 2020 11:56:39 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Qualityparam generated by hbm2java
 */
@Entity
@Table(name = "qualityparam", catalog = "sbnz")
public class Qualityparam implements java.io.Serializable {

	private Long paramId;
	private String paramDesc;
	private String paramCode;
	private boolean paramSystem;
	private Set productqualityparams = new HashSet(0);

	public Qualityparam() {
	}

	public Qualityparam(String paramDesc, String paramCode, boolean paramSystem) {
		this.paramDesc = paramDesc;
		this.paramCode = paramCode;
		this.paramSystem = paramSystem;
	}

	public Qualityparam(String paramDesc, String paramCode, boolean paramSystem, Set productqualityparams) {
		this.paramDesc = paramDesc;
		this.paramCode = paramCode;
		this.paramSystem = paramSystem;
		this.productqualityparams = productqualityparams;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "PARAM_ID", unique = true, nullable = false)
	public Long getParamId() {
		return this.paramId;
	}

	public void setParamId(Long paramId) {
		this.paramId = paramId;
	}

	@Column(name = "PARAM_DESC", nullable = false, length = 300)
	public String getParamDesc() {
		return this.paramDesc;
	}

	public void setParamDesc(String paramDesc) {
		this.paramDesc = paramDesc;
	}

	@Column(name = "PARAM_CODE", nullable = false, length = 10)
	public String getParamCode() {
		return this.paramCode;
	}

	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
	}

	@Column(name = "PARAM_SYSTEM", nullable = false)
	public boolean isParamSystem() {
		return this.paramSystem;
	}

	public void setParamSystem(boolean paramSystem) {
		this.paramSystem = paramSystem;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "qualityparam")
	public Set getProductqualityparams() {
		return this.productqualityparams;
	}

	public void setProductqualityparams(Set productqualityparams) {
		this.productqualityparams = productqualityparams;
	}

}
