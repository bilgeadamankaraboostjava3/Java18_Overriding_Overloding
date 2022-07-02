package com.muhammet.entity;

public class Araba extends Arac{

	public int kapisayisi;
	public String plaka;
	public int vites;
	/**
	 * Overloading -> Methodlarýn aþýrý yüklenmesi.
	 */
	public void hizlan() {
		if(vites<1)
			this.hiz += 5;
		else
			this.hiz += 5*vites;
	}
	public void hizlan(int vites) {
		this.hiz += 5*vites;
		this.vites = vites;
	}
	
}
