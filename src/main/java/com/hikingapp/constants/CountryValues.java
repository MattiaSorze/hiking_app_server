package com.hikingapp.constants;

public enum CountryValues {
	
	ITALY("IT", "Italy", "39" ),
	SPAIN("ES", "Spain", "34" ),
	FRANCE("FR", "France", "33");
	
	private String code;
	private String label;
	private String phone;
	
	private CountryValues(String code, String label, String phone) {
		this.code = code;
		this.label = label;
		this.phone = phone;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
