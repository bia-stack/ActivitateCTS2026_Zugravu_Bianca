package Main;

import ProgramFarmacie.Medicament;
import Adapter.AdaptorSpital;

public class Main {
    public static void procurareMedicament(Medicament medicament){
        medicament.cumparaMedicament();
    }

    public static void main(String[] args){
        ProgramSpital.Medicament medSpital1 = new ProgramSpital.Medicament("Nurofen Forte", 20);
        ProgramFarmacie.Medicament medFarmacie = new Medicament("Triferment",15);

        medSpital1.achizitioneazaMedicament();
        medFarmacie.cumparaMedicament();

        ProgramSpital.Medicament medSpital2 = new ProgramSpital.Medicament("Vibrocil",25);
        AdaptorSpital adaptorMedicament = new AdaptorSpital(medSpital2,10);

        procurareMedicament(adaptorMedicament);

    }
}
