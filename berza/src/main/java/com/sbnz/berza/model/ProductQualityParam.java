package com.sbnz.berza.model;
// Generated Jun 25, 2020 11:56:39 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Productqualityparam generated by hbm2java
 */
@Entity
@Table(name = "productqualityparam", catalog = "sbnz")
public class Productqualityparam implements java.io.Serializable {

	private Long pqpId;
	private Product product;
	private Qualityparam qualityparam;
	private boolean pqpSpecific;

	public Productqualityparam() {
	}

	public Productqualityparam(Product product, Qualityparam qualityparam, boolean pqpSpecific) {
		this.product = product;
		this.qualityparam = qualityparam;
		this.pqpSpecific = pqpSpecific;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "PQP_ID", unique = true, nullable = false)
	public Long getPqpId() {
		return this.pqpId;
	}

	public void setPqpId(Long pqpId) {
		this.pqpId = pqpId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCT_ID", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QP_ID", nullable = false)
	public Qualityparam getQualityparam() {
		return this.qualityparam;
	}

	public void setQualityparam(Qualityparam qualityparam) {
		this.qualityparam = qualityparam;
	}

	@Column(name = "PQP_SPECIFIC", nullable = false)
	public boolean isPqpSpecific() {
		return this.pqpSpecific;
	}

	public void setPqpSpecific(boolean pqpSpecific) {
		this.pqpSpecific = pqpSpecific;
	}

}
