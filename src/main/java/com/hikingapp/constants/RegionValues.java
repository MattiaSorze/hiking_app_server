package com.hikingapp.constants;

public enum RegionValues {

	LOMBARDIA("Lombardia"),
	TRENTINO_ALTO_ADIGE("Trentino Alto Adige"),
	PIEMONTE("Piemonte"),
	VAL_D_AOSTA("Val d'Aosta"),
	LIGURIA("Liguria"),
	VENETO("Veneto"),
	FRIULI_VENEZIA_GIULIA("Friuli Venezia Giulia"),
	EMILIA_ROMAGNA("Emilia Romagna"),
	TOSCANA("Toscana"),
	UMBRIA("Umbria"),
	MARCHE("Marche"),
	ABRUZZO("Abruzzo"),
	LAZIO("Lazio"),
	CAMPANIA("Campania"),
	PUGLIA("Puglia"),
	BASILICATA("Basilicata"),
	CALABRIA("Calabria"),
	SICILIA("Sicilia"),
	SARDEGNA("Sardegna");
	
	private String label;
	
	private RegionValues(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
