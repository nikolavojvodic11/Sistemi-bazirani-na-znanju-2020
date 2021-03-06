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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Buyeraccount generated by hbm2java
 */
@Entity
@Table(name = "buyeraccount", catalog = "sbnz")
public class Buyeraccount implements java.io.Serializable {

	private Long buyerAccountId;
	private Buyer buyer;
	private long active;
	private long valid;
	private Set buyers = new HashSet(0);

	public Buyeraccount() {
	}

	public Buyeraccount(Buyer buyer, long active, long valid) {
		this.buyer = buyer;
		this.active = active;
		this.valid = valid;
	}

	public Buyeraccount(Buyer buyer, long active, long valid, Set buyers) {
		this.buyer = buyer;
		this.active = active;
		this.valid = valid;
		this.buyers = buyers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "BUYER_ACCOUNT_ID", unique = true, nullable = false)
	public Long getBuyerAccountId() {
		return this.buyerAccountId;
	}

	public void setBuyerAccountId(Long buyerAccountId) {
		this.buyerAccountId = buyerAccountId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BUYER_ID", nullable = false)
	public Buyer getBuyer() {
		return this.buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	@Column(name = "ACTIVE", nullable = false)
	public long getActive() {
		return this.active;
	}

	public void setActive(long active) {
		this.active = active;
	}

	@Column(name = "VALID", nullable = false)
	public long getValid() {
		return this.valid;
	}

	public void setValid(long valid) {
		this.valid = valid;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "buyeraccount")
	public Set getBuyers() {
		return this.buyers;
	}

	public void setBuyers(Set buyers) {
		this.buyers = buyers;
	}

}
