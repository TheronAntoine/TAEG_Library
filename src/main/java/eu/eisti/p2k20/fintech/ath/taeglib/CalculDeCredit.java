package eu.eisti.p2k20.fintech.ath.taeglib;

import java.math.BigDecimal;

public class CalculDeCredit {
	
	private BigDecimal nbMensualites;
	private BigDecimal dernMensualite;
	private BigDecimal taeg;
	
	public CalculDeCredit(BigDecimal nbMensualites, BigDecimal dernMensualite, BigDecimal taeg) {
		
		this.nbMensualites = nbMensualites;
		this.dernMensualite = dernMensualite;
		this.taeg = taeg;
	}

	public BigDecimal getNbMensualites() {
		return nbMensualites;
	}

	public void setNbMensualites(BigDecimal nbMensualites) {
		this.nbMensualites = nbMensualites;
	}

	public BigDecimal getDernMensualite() {
		return dernMensualite;
	}

	public void setDernMensualite(BigDecimal dernMensualite) {
		this.dernMensualite = dernMensualite;
	}

	public BigDecimal getTaeg() {
		return taeg;
	}

	public void setTaeg(BigDecimal taeg) {
		this.taeg = taeg;
	}
}
