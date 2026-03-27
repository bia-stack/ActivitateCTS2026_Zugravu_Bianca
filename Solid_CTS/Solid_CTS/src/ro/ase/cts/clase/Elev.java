package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float sumaFinantare = 30;

	public static float getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(float sumaFinantare) {
		Elev.sumaFinantare = sumaFinantare;
	}

	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Elevul/a ");
		sb.append("Clasa: ").append(clasa).append('\n');
		sb.append("Tutorele: ").append(tutore).append('\n');
		return sb.toString();
	}
	
	public Elev() {
		super();
	}

	
	public void afisareVenit() {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+Elev.sumaFinantare +" Euro/zi in proiect.");
	}
	
}
