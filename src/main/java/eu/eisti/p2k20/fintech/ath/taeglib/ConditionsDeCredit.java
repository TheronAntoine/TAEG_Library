package eu.eisti.p2k20.fintech.ath.taeglib;

import java.math.BigDecimal;

public class ConditionsDeCredit {
	
	private BigDecimal capitalEmprunte;
	private BigDecimal taux;
	private int mensualites;
	private int fraisDossier;
	

	public void CalculerAmortissement() {
		
	}
	
	public void DeterminerResultat() {
		
	}
	
	private BigDecimal CalculTAEG() {
		return null;
	}
	
	
	

	
	
	public BigDecimal getCapitalEmprunte() {
		return capitalEmprunte;
	}

	public void setCapitalEmprunte(BigDecimal capitalEmprunte) {
		this.capitalEmprunte = capitalEmprunte;
	}

	public BigDecimal getTaux() {
		return taux;
	}

	public void setTaux(BigDecimal taux) {
		this.taux = taux;
	}

	public int getmensualites() {
		return mensualites;
	}

	public void setmensualites(int mensualites) {
		this.mensualites = mensualites;
	}

	public int getFraisDossier() {
		return fraisDossier;
	}

	public void setFraisDossier(int fraisDossier) {
		this.fraisDossier = fraisDossier;
	}
	
	
}
