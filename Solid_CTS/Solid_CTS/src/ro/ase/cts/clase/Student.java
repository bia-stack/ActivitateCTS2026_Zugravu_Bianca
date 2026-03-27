package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static float sumaFinantare = 30;

	public static float getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(float sumaFinantare) {
		Student.sumaFinantare = sumaFinantare;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}

	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Studentul/a ");
		sb.append("Facultate: ").append(facultate).append('\n');
		sb.append("An de studiu:").append(an_studii);
		return sb.toString();
	}
	
	
	public void afisareVenit() {
		System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste"+Student.sumaFinantare+" Euro/zi in proiect.");
	}
	
}
