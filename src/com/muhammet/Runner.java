package com.muhammet;

import com.muhammet.entity.Araba;
import com.muhammet.entity.Ucak;

public class Runner {

	public static void main(String[] args) {

		Ucak ucak = new Ucak();
		ucak.hizlan();
		ucak.hizlan();
		ucak.hizlan();
		System.out.println("U�a��n h�z�.....: "+ ucak.hiz);

		Araba araba = new Araba();
		araba.hizlan(3);
		araba.hizlan(3);
		araba.hizlan(3);
		System.out.println("Araban�n h�z�....: "+ araba.hiz);
	}

}
